import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;



public class DBconnect {
	public static void main(String[] args) {
		
		
		try {
			
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sectionh","root","@Naman123");
			Statement statement=connection.createStatement();
			ResultSet set=statement.executeQuery("SELECT * FROM student");
			float msal=0.0f;
			String name=" ";
			System.out.println("Connection Succesfull");
			
			while(set.next())
				
				
			{
				    if(msal<set.getFloat(4)) {
					msal=set.getFloat(4);
					name=set.getString(2);
					
				}
				
				System.out.println(set.getString(2));
			}
			System.out.println("Maximum Salary is "+msal +" hold by "+name);

			
			
			
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
