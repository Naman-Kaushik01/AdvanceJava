import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Tester {
	public static void main(String[] args) {
		
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager =factory.createEntityManager();
		entityManager.getTransaction().begin();
		Employee employee = new Employee();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name: ");
		String name =scanner.next();
		System.out.println("Enter Work: ");
		String work=scanner.next();
		System.out.println("Enter salary :");
		float salary= scanner.nextFloat();
		employee.setName(name);
		employee.setWork(work);
		employee.setSalary(salary);
		
		System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getWork()+" "+employee.getSalary());
		
		

		entityManager.persist(employee);
		
		
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
		
	}

}
