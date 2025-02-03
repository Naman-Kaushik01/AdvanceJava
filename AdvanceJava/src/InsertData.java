import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertData {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection =DriverManager.getConnection("jdbc:mysql://localhost:3306/sectionh","root", "@Naman123");
			System.out.println("Connection Successfull");
			Statement statement=connection.createStatement();
			
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter your Name and Address and Salary");
			String name=scanner.next();
			String Address=scanner.next();
			Float salary=scanner.nextFloat();
			
			
			
			
			String query="insert into student(`Name`,`Address`,`Salary`)values('"+name+"','"+Address+"','"+salary+"')";
			statement.executeUpdate(query);
			System.out.println("Done ");
			ResultSet set=statement.executeQuery("SELECT * FROM sectionh.student;");
			while(set.next()) {
				System.out.println(set.getInt(1)+" "+set.getString(2)+" "+set.getString(3)+" "+set.getFloat(4));
			
			}
			
			
			
			
		}
		catch(Exception e) {
			
		}
	}

}
