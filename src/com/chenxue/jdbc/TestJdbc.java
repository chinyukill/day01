package com.chenxue.jdbc;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

/**
 * 
 * @author chenxue
 *
 */
public class TestJdbc {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
//		DriverManager.registerDriver(new Driver());
		//使用反射技术将驱动类加载到内存
		
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/test";
		String user = "root";
		String password = "root";
		Connection con=(Connection) DriverManager.getConnection(url, user, password);
//		System.out.println(con);
		Statement cst = con.createStatement();
		int eu = cst.executeUpdate("insert into sort2(sname,sprice,sdesc) values ('饮水机',231,'周六日福利')");
		System.out.println(eu);
		cst.close();
		con.close();
		
		
		
	}

}
