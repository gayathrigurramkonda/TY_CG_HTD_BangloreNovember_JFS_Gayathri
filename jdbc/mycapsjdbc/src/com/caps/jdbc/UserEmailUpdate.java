package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
	
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver has been loaded");
			//get db connection
			String dbUrl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("enter dbuser and password");
			String dbuser=sc.nextLine();
			String dbpassword=sc.nextLine();
			conn=DriverManager.getConnection(dbUrl,dbuser,dbpassword);
			System.out.println("connection established");
			//issue sql query
			String query="update users_info set email= ? "+"where  userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter userid");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter email");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter password");
			pstmt.setString(3, sc.nextLine());
			int count=pstmt.executeUpdate();
			System.out.println("query is issued");
			//process the result
			if(count>0) {
				System.out.println("query ok"+count+"rows effected");
			}else {
				System.out.println("something went wrong");
			}
			sc.close();
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		finally  {
			try {
				if(conn!=null) 
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
	}
		
		
	}

}
