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
			//Class.forName("com.mysql.jdbc.Driver");
			reader =new FileReader("dbproperties");
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
	public boolean searchProduct(ProductBean bean) {
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"),prop.getProperty("dbUser"),prop.getProperty("dbPassword"));
				java.sql.PreparedStatement pstmt=conn.prepareStatement(prop.getProperty("searchQuery"));
				)
		{
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {

				int productId = rs.getInt(1);
				String productName = rs.getString(2);
				double productCost = rs.getDouble(3);
				String productClor = rs.getString(4);
				String Description = rs.getString(5);
				int NumberOfProducts= rs.getInt(6);
				String postCode = rs.getString(7);
				Integer telephoneNo = rs.getInt(8);
				String email = rs.getString(9);
				int count=pstmt.executeUpdate();
				
				

			

			

		}
		
	
	

		
	@Override
	public List<ProductBean> showAllProducts() {
		List<ProductBean> list=new ArrayList<ProductBean>();
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dbUrl"));
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
		}return list;
				
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
