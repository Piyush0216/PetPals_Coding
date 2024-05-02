package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnection{
	
	static String userDB="root";
	static String passDB="";
	static String url="jdbc:mysql://localhost:3306/petpals";
	static String driver="com.mysql.jdbc.Driver";
	static Connection con;
	
	public static Connection dbConnect() {
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			System.out.println("Driver not loaded");
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(url, userDB, passDB);
		} catch (SQLException e) {
			System.out.println("Connection failed");
			e.printStackTrace();
		}
		return con;
	}

	public static void dbClose() {
		try {
			con.close();
		} catch (SQLException e) {
			System.out.println("Connection not closed");
			e.printStackTrace();
		}
	}	
	
}