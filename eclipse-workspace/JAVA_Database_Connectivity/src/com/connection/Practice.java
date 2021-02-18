package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Practice {
	
	public static void main(String[] args) throws SQLException {
		
	Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");
	
	Statement myStatment = myConnection.createStatement();
	
	// 1. insert data
	
	 //String insertScript = "INSERT INTO `school`.`student` (`id`, `name`, `age`) VALUES ('105', 'mahboob', '30');";
	
	// 2. update data 
	
	//String updateScript = "update `school`.`student` set name = 'Mahmood', age = 31 where id = 101;";
	
	// 3. delete data
	
	//String deleteScript = "delete from student where id = 101";
	
	// 4. select data from database
	
	String selectScript = "select id, name, age from student";
	
	ResultSet rs = myStatment.executeQuery(selectScript);
	
	while(rs.next()) {
		int id = rs.getInt("id");
		String stName = rs.getString("name");
		int age = rs.getInt("age");
		
		System.out.println(id + stName + age);
	}
	
	//myStatment.execute(deleteScript);
	
	System.out.println("executed");
		
	}

}
