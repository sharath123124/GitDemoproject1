package Default;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEx3 {

	private static final String url="jdbc:mysql://127.0.0.1:3306/collage"; //Mysql database url copy from mysql
	private static final String username="root";
	private static final String password="KA10q9946@";
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");//to load the driver
//			com.mysql.cj.jdbc.Driver : inside this package drivers are present
		} 
		catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		}
		
		
		try {
			Connection con = DriverManager.getConnection(url,username,password);
			
			Statement stmt =con.createStatement();
			
			String query=String.format("update student set STUDENT_NAME='%s' where CITY= '%s'", "kumar ms","cal");
			int rowseffected = stmt.executeUpdate(query);
			
			if(rowseffected>0) {
				System.out.println("updated succesfully");
			}else {
				System.out.println("not updated");
			}
				
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
