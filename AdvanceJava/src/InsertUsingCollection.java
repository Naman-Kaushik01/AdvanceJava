import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

public class InsertUsingCollection {
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/sectionh", "root", "@Naman123");
			Statement statement= connection.createStatement();
			ResultSet set =statement.executeQuery("SELECT *FROM student");
			System.out.println("Connection Successfull");
			
			Scanner scanner =new Scanner(System.in);
			System.out.println("Enter Name : ");
			String name=scanner.next();
			System.out.println("Enter Work : ");
			String work=scanner.next();
			System.out.println("Enter Salary : ");
			Float salary=scanner.nextFloat();
			
			ArrayList<Employee> list = new ArrayList<>();
			Employee employee= new Employee();
			employee.setName(name);
			employee.setWork(work);
			employee.setSalary(salary);
			
//			System.out.println("ArrayList insertion done");
			
			String query = "INSERT INTO `sectionh`.`employee` (`Name`, `Work`, `Salary`) VALUES ('"+employee.getName()+"', '"+employee.getWork()+"', '"+employee.getSalary()+"')";
			statement.executeUpdate(query);
			
			System.out.println("Insertion done");
			
			
		}
		catch(Exception e) {
			
		}
	}

}
