

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		Configuration configuration=new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory =configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.getTransaction().begin();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter id to delete");
		
		Employee employee=session.get(Employee.class, scanner.nextInt());
		
		session.delete(employee);
		System.out.println("Deletion done");
		
		session.getTransaction().commit();
		

	}

}
