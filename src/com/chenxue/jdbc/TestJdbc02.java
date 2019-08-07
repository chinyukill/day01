package com.chenxue.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestJdbc02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/test";
		String user="root";
		String password="root";
		Connection con = DriverManager.getConnection(url, user, password);
		Statement stat = con.createStatement();
		String sql="select * from users";
		ResultSet rs = stat.executeQuery(sql);
		while(rs.next()) {
			System.out.print(rs.getString("username")+"\t");
			System.out.print(rs.getString("id")+"\t");
			System.out.print(rs.getString("password")+"\n");
		}
		
		rs.close();
		stat.close();
		con.close();
	}

}
