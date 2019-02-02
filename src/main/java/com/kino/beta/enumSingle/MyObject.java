package com.kino.beta.enumSingle;

import java.sql.Connection;
import java.sql.DriverManager;

public enum MyObject {

	 connectionFactory;
	private Connection connection;
	
	private MyObject() {
		try {
			System.out.println("调用构造函数：myObject()");
			String url ="jdbc:mysql://192.168.6.28:3306/pf";
			String username="pf";
			String password="tipray";
			String driveName = "com.mysql.jdbc.Driver";
			Class.forName(driveName);
			connection = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Connection getConnection(){
		return connection;
	}
	
}
