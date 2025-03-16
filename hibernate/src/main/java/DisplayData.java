import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DisplayData {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
	    configuration.configure("hibernate.cfg.xml");
	    SessionFactory factor=configuration.buildSessionFactory();
	    Session session=factor.openSession();
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter the id:");
	    Employee employee=session.get(Employee.class,scanner.nextInt());
	    System.out.println(employee.getName());
	    
	    Query query =session.createQuery("from Employee");
	    List<Employee> list= query.list();
	    
	    
	    for(Employee e :list) {
	    	System.out.println(e.getId()+" "+e.getName()+" "+e.getSalary()+" "+e.getWork());
	    }
	    factor.close(); 
	}

}
