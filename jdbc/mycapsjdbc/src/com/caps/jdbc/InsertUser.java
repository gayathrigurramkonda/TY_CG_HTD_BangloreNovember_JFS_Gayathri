package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;


		// Load the driver class
		try {
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver is loaded");
			//get the db connection
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter dbuser and password");
			String dbuser=sc.nextLine();
			String dbpass=sc.nextLine();
			conn=DriverManager.getConnection(dburl,dbuser,dbpass);
			System.out.println("connection established");
			//issue sql query
			String query="insert into users_info values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter userid.....");
			pstmt.setInt(1,Integer.parseInt(sc.nextLine()));
			System.out.println("enter username.....");
			pstmt.setString(2,sc.nextLine());
			System.out.println("enter email.....");
			pstmt.setString(3,sc.nextLine());
			System.out.println("enter password.....");
			pstmt.setString(4,sc.nextLine());

			int count=pstmt.executeUpdate();





			if(count>0){
				System.out.println("inserted data");
			}else {
				System.out.println("something went wrong");
			}



		} catch (SQLException e) {
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
