import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class FetchData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/sectionh","root","@Naman123");
	        Statement statement =connection.createStatement();
	        ResultSet set = statement.executeQuery("SELECT * FROM sectionh.student");
	        System.out.println("Success");
	        
	        ArrayList<Student> user= new ArrayList<Student>();
	        
	        while(set.next()) {
				Student student = new Student();
				student.setId(set.getInt(1));
				student.setName(set.getString(2));
				student.setName(set.getString(3));
				student.setSalary(set.getFloat(4));
				user.add(student);
			}
	        
	        for(Student s:user) {
	        	System.out.println(s.getId()+" "+s.getName()+" "+ s.getAddress() +" " +s.getSalary());
	        }
	        System.out.println(user);
		}
		
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
