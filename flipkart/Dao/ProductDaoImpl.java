package com.capgemini.flipkart.Dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.capgemini.flipkart.beans.ProductBean;
import com.mysql.jdbc.PreparedStatement;

public class ProductDaoImpl  implements ProductDao{

	FileReader reader;
	Properties prop;
	ProductBean product;
	
	public ProductDaoImpl(){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			reader =new FileReader("db.properties");
			prop=new Properties();
			prop.load(reader);
			
		} catch (Exception  e) {
		
			e.printStackTrace();
		}
	}
		
	@Override
	public boolean buyProduct(ProductBean bean) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public ProductBean searchProduct(String productName) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("Query")))
		{
			pstmt.setString(1, productName);;
			ResultSet rs=pstmt.executeQuery();
			if(rs.next()) {
				System.out.println("Productid: "+rs.getInt(1));
				  System.out.println("productName: "+rs.getString(2));
				  System.out.println("ProductColor: "+rs.getString(3));
				  System.out.println("ProductDescription: "+rs.getString(4));
				  System.out.println("ProductCost: "+rs.getString(5));
				  System.out.println("NumberOfProducts: "+rs.getString(6));
				
				
			}else {
				System.out.println("please enter correct details");
				
			}
	
		}
			catch(Exception e) {
				e.printStackTrace();
			}return null;
				
		}

		

		
		
	
	

		
	@Override
	public List<ProductBean> showAllProducts() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				Statement stmt=conn.createStatement();
				
				ResultSet rs=stmt.executeQuery(prop.getProperty("query1"))){
				while(rs.next()) {
				product=new ProductBean();
				product.setProductId(rs.getInt(1));
				product.setProductName(rs.getString(2));
				product.setProductCost(rs.getDouble(3));
				product.setProductColor(rs.getNString(4));
				product.setDescription(rs.getString(5));
				product.setNumberOfProducts(rs.getInt(6));
				list.add(product);
		}return list;
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
