import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateData {
	public static void main(String[] args) {
		Configuration configuration= new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    SessionFactory sessionFactory= configuration.buildSessionFactory();
	    Session session = sessionFactory.openSession();
	    session.getTransaction().begin();
	    
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter Name :");
	    String newName =scanner.next();
	    System.out.println("Enter id to update :");
	    Employee employee= session.get(Employee.class,scanner.nextInt());
	    employee.setName(newName);
	    session.save(employee);
	    
	    session.getTransaction().commit();
	    
	  
	}

}
