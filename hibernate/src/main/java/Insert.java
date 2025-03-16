

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {
	public static void main(String[] args) {
		Configuration configuration= new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory= configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		org.hibernate.Transaction transaction =session.beginTransaction();
		Employee employee = new Employee();
		employee.setName("Alex");
		employee.setSalary(233);
		employee.setWork("AWS");
		session.save(employee);
		transaction.commit();
		session.close();
		
		System.out.println("Insertion done");
		
		
	    
		
		

		
	}

}  
