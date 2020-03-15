package com.db;

import java.sql.*;

public class InsertQueryTest {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_info", "root","password");
		Statement st = con.createStatement();
		int rs = st.executeUpdate("INSERT INTO `mobile_info`.`employee_table`\r\n" + 
				"(`employee_id`,\r\n" + 
				"`name`,\r\n" + 
				"`salary`,\r\n" + 
				"`state`)\r\n" + 
				"VALUES\r\n (1,'aravind',50000,'Tamil Nadu')");
		
		System.out.println("updated rows "+rs);
		con.close();

	}

}
