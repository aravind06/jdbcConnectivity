package com.db;

import java.sql.*;

public class TestConnection {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mobile_info", "root", "password");
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select * from mobile_information");
		
		while(rs.next()) {
			String data = rs.getInt("serial_id") +"--"+ rs.getString("name") +"--"+rs.getString("brand");
			System.out.println(data);
		}
		
		rs.close();
		connection.close();
	}

}
