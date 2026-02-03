package com.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
	
	public static void printMessage() {
		System.out.println("This is the Batman....");
		System.out.println("Checking the merge conflict");
		System.out.println("Hey, This can be a Merge conflict");
	}

	public static void main(String[] args) throws Exception {
		System.out.println("Hello World!!");
		System.out.println("abcdefghij");
		System.out.println("abcdefghij");
		System.out.println("abcdefghij");
		System.out.println("second brach");

		String url = "jdbc:postgresql://localhost:5432/testdb";
		String username = "postgres";
		Class.forName("org.postgresql.Driver");
		Connection conn = DriverManager.getConnection(url,username, password);
		if(conn != null) {
			System.out.println("Connecting.... Successfully...");
		}
		else {
			System.out.println("Connection...... failed..");
		}
			System.out.println("heloo guys");
			
			
			printMessage();
		
 System.out.println("heloo guys");
 System.out.println("may this cause merge conflict");
 System.out.println("hiiii");
	}

}
