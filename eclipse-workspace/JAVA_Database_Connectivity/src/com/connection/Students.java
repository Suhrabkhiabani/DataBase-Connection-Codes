package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Students {

	public static void main(String[] args) throws SQLException {

		// create connection to our database

		Connection myConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/school", "root", "root");

		Statement myStatment = myConnection.createStatement();

		// write your our query or script.
		// 1. want to insert data to our table.

		// String insertScript = "INSERT INTO `itsoft_academy`.`student` (`id`,
		// `first_name`, `last_name`, `age`, `adress`) VALUES ('101', 'mahboob',
		// 'mahbood', '30', 'Kabul');";

		// execute our query

		// myStatment.execute(insertScript);

		// 2. want to update data in our table

		// String updateScript = "update `itsoft_academy`.`student` set first_name =
		// 'Ahmad', age = '38' where id = 20";

		// myStatment.execute(updateScript);

		// 3. want to delete data from our table.

		// String deleteScript = "DELETE FROM `itsoft_academy`.`student` WHERE id =
		// 101";

		// myStatment.execute(deleteScript);

		// 4. want to get or select data from our table

		String selectScript = "select id, first_name, age from `itsoft_academy`.`student`";

		ResultSet rs = myStatment.executeQuery(selectScript);
		
		while(rs.next()) {
			int id  = rs.getInt("id");
			String stName = rs.getString("first_name");
			int age = rs.getInt("age");
			
			System.out.println(id + " " + stName + " " + age);
		}

		// close the connection

		myConnection.close();

		//System.out.println("query executed");

	}

}
