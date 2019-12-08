package com.caps.jdbc;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;
import java.sql.ResultSet;



public class EvolvedJDBCV2 {
	public static void main(String[] args) {
		FileReader reader=null;
		Properties prop=null;
		try {
		 reader=new FileReader("C:\\Users\\hp\\Desktop\\db.properties");
		 prop=new Properties();
		prop.load(reader);
		
		Class.forName(prop.getProperty("driverClass"));
		System.out.println("Driver loaded");
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
			while(rs.next()) {
				System.out.println("userid:"+rs.getInt(1));
				System.out.println("username:"+rs.getString(2));
				System.out.println("Email:"+rs.getString(3));
				System.out.println("************************************");
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

