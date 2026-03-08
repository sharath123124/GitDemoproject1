package Default;
import java.sql.*;
public class JdbcEX1 {

	
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
			
			Statement stmt = con.createStatement();
			
			ResultSet rs = stmt.executeQuery("select * from student");
			
			while(rs.next()) 
			{	
				int id=rs.getInt("ROLLNO");
				String name=rs.getString("STUDENT_NAME");
				int marks=rs.getInt("MARKS");
				String grade=rs.getString("GRADE");
				String city=rs.getString("CITY");
				System.out.println(id);
				System.out.println(name);
				System.out.println(marks);
				System.out.println(grade);
				System.out.println(city);				
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
