package org.nogandi.web;



import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySQLConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	// "com.mysql.jdbc.Driver";
	// "com.mysql.cj.jdbc.Driver";

	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false";
	// "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false";
	// "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false&serverTimezone=UTC";
	// "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false&serverTimezone=UTC";
	// "jdbc:mysql://127.0.0.1:3306/book_ex?useSSL=false&serverTimezone=UTC";

	private static final String USER = "nogandi";
	private static final String PW = "1231230";

	@Test
	public void testConnection() throws Exception {
		Class.forName(DRIVER); 
		
		try(Connection con = DriverManager.getConnection(URL, USER, PW)) {
			System.out.println(con);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
