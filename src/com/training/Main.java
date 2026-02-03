package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		System.out.println("Hello World!!");
		String url = "jdbc:postgresql://localhost:5432/testdb";
		String username = "postgres";
		String password="pass123";
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(url,username, password);
		if(conn != null) {
			System.out.println("Connected Successfully...");
		}
		else {
			System.out.println("Connection failed..");
		}
 System.out.println("heloo guys");
 System.out.println("this is new line from branch-A1");
	}

}
