package Default;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcEX2 {

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
			
			String query=String.format("insert into student(ROLLNO,STUDENT_NAME,MARKS,GRADE,CITY) values(%o,'%s',%o,'%s','%s')", 107,"bhanu",67,"B","cal");
			int rowseffected = stmt.executeUpdate(query);
			
			if(rowseffected>0) {
				System.out.println("inserted succesfully");
			}else {
				System.out.println("not inserted");
			}
				
			
		
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
