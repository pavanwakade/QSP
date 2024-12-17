package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionJdbcPostgreSQL {

public static void main(String[] args) {
		
		//MySQL variables
		String url="jdbc:postgresql://localhost:5432/qsp";
		String user="postgres";
		String pass = "root";
		
//		String Url="jdbc:postgresql://localhost:5432/qsp?user=postgres&password=root";
		try
		{
			//step 1
			
			//MySQL connection
			Class.forName("org.postgresql.Driver");
			System.out.println("postgresql Driver class is loaded");
			Connection  con=DriverManager.getConnection(url,user,pass);
			System.out.println("postgresql Connection is created");
			
			con.close();
		}
		catch(ClassNotFoundException |SQLException e)
		{
			e.printStackTrace();
		}
	}
}