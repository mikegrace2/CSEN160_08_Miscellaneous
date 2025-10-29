package com.csen160.FinalImplementationExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchInsert {
	public static void batchInsert() {
	     try {
			Connection conn = DriverManager.getConnection("...", "root", "password");
			Statement stmt = conn.createStatement();
			stmt.addBatch("INSERT INTO employees (id, name, salary) VALUES (1, 'Alice', 5000.0)");
			stmt.addBatch("INSERT INTO employees (id, name, salary) VALUES (2, 'Bob', 500.4)");
			stmt.addBatch("INSERT INTO employees (id, name, salary) VALUES (3, 'Carl', 50.7)");
			stmt.executeBatch();
	     } catch (SQLException ex){
	    	 System.out.println("SQL exception!");
	     }
	}

	public static void main(String[] args) {
		BatchInsert.batchInsert();

	}
}
