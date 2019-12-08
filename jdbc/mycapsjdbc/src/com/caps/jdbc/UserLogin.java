package com.caps.jdbc;

import java.sql.Connection;

import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import java.sql.PreparedStatement;

public class UserLogin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		try {
			//load the drivers
			//Driver driver =new com.mysql.jdbc.Driver();
			//DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded");
			
			
			//get the db connectivity via connection
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("Enter username and password");
			String dbUser=sc.nextLine();
			String dbpass=sc.nextLine();
			conn=DriverManager.getConnection(dburl,dbUser,dbpass);
			System.out.println("connection established");
			
			
			//issue SQL queries via connection
			String query="select * from users_info where userid=? AND password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter userid.....");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("enter password.....");
			pstmt.setString(2,sc.nextLine());
			rs=pstmt.executeQuery();
			System.out.println("query issued And Executed********");
			if(rs.next()) {
				System.out.println("userid:"+rs.getInt(1));
				System.out.println("username:"+rs.getString(2));
				System.out.println("Email:"+rs.getString(3));
				System.out.println("************************************");
			}
			
		}catch(Exception e) {
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


