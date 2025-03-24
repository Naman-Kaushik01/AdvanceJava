import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAOperations {

	public static void main(String[] args) {
		EntityManagerFactory factory =Persistence.createEntityManagerFactory("emp");
		EntityManager entityManager =factory.createEntityManager();
		entityManager.getTransaction().begin();
		
		//UPDATE OPERATION
		
		Employee employee=entityManager.find(Employee.class,14);
		System.out.println(employee.getName());
		employee.setName("Kuffi");
		System.out.println(employee.getName());
		
		//DELETE AN ELEMENT
		
		Employee emp = entityManager.find(Employee.class, 7);
		entityManager.remove(emp);
		
		
		entityManager.persist(employee);
		
		entityManager.getTransaction().commit();
		entityManager.close();
		factory.close();
	}

}
