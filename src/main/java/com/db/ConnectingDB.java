package com.db;

import java.sql.*;
public class ConnectingDB {

	/*
	 * register driver
	 * establish connection
	 * create statement
	 * execute query
	 * process resultset
	 * close connection
	 * 
	 */
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_info", "root", "password");
		Statement st = con.createStatement();
		ResultSet rt = st.executeQuery("select * from mobile_information");
		//jdbc:mysql://localhost:3306/?user=root
		rt.next();
		String value  = rt.getString("description");
		System.out.println(value);
		
		rt.close();
		con.close();
	}

}
