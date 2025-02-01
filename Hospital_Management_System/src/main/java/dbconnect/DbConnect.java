package dbconnect;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
	
	private static Connection conn;

	public static Connection getConnection() {   	 
	
		try {

			Class.forName("oracle.jdbc.driver.OracleDriver");

			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "C##USERA", "sk");
					

		} catch (ClassNotFoundException | SQLException e) {

			e.printStackTrace();
		}

		return conn;

	}

}
