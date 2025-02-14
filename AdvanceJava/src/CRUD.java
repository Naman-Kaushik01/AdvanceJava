import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class CRUD {
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sectionh","root","@Naman123");
			System.out.println("Connection Successfull!");
		    Statement statement= connection.createStatement();
		   
		    
		    // INSERT OPERATION
		    
		    Scanner scanner = new Scanner(System.in);
		    System.out.println("Name, Work and Salary");
		    statement.executeUpdate("INSERT INTO `sectionh`.`employee` (`Name`, `Work`, `Salary`) VALUES ( '"+scanner.next()+"', '"+scanner.next()+"', '"+scanner.nextFloat()+"')");
		    System.out.println("Inserted Successfully");
		    ResultSet set= statement.executeQuery("SELECT *FROM employee");
		    while(set.next()) {
		    	System.out.println(set.getInt(1)+ " "+ set.getString(2)+" "+set.getString(3)+" "+set.getFloat(4));
		    }
		    
		    
		    // UPDATE OPERATION
		    
		    System.out.println("Enter Salary and id to Update :");
		    statement.executeUpdate("UPDATE `sectionh`.`employee` SET `Salary` = '"+scanner.nextFloat()+"' WHERE (`id` = '"+scanner.nextInt()+"')");
		    ResultSet set1= statement.executeQuery("SELECT *FROM employee");
		    while(set1.next()) {
		    	System.out.println(set1.getInt(1)+ " "+ set1.getString(2)+" "+set1.getString(3)+" "+set1.getFloat(4));
		    }
		    
		    System.out.println("Updated Successfully");
		    
		    //DELETE OPERATION
		    
		    System.out.println("Enter id to delete:");
		    statement.executeUpdate("DELETE `sectionh`.`employee`  WHERE (`id` = '"+scanner.nextInt()+"')");
		    System.out.println("Deleted Successfully");
		    ResultSet set2= statement.executeQuery("SELECT *FROM employee");
		    while(set2.next()) {
		    	System.out.println(set2.getInt(1)+ " "+ set2.getString(2)+" "+set2.getString(3)+" "+set2.getFloat(4));
		    }
		}
		catch(Exception e) {
			
		}
	}

}
