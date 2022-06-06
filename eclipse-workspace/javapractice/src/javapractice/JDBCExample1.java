package javapractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample1 {

	public static void main(String[] args) throws SQLException {
	
		Connection con = DriverManager.getConnection("www.google.com");

	}

}
