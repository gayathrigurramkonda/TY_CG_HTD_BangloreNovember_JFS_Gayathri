
package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		try {
			//load the driver
			//Driver driver =new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			
			//get DBconnection via driver
			String dbUrl ="jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";
			conn = DriverManager.getConnection(dbUrl);
			System.out.println("connection estd.....");
			//issue SQL queries via connection
			String query="select* from users_info";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(query);
			System.out.println("query issued");
			System.out.println("***************************************");
			//process result returned
			while(rs.next()) {
				System.out.println("userid:"+rs.getInt("userid"));
				System.out.println("username:"+rs.getString("username"));
				System.out.println("Email:"+rs.getString("email"));
				System.out.println("************************************");
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		//close all JDBC object	
		finally  {
				try {
					if(conn!=null) 
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				try {
					if(rs!=null)
						rs.close();
					
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		
		
        	
		

		
	}

}
