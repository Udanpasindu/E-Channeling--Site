package com.patient;

import java.sql.*;

public class DBconnect {
	private static String URL = "jdbc:mysql://localhost:3306/doclinkonline";
	private static String Username = "root";
	private static String Password = "MeNu@2k1rcm";
	private static Connection con ;
	
	public static Connection getConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			con = DriverManager.getConnection(URL, Username, Password);
		}catch(Exception e) {
			System.out.println("Database connection Not success!!");
			
		}
		return con;
		
	}

}
