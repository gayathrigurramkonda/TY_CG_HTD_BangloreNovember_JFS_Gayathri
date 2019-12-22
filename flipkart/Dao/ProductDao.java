package com.capgemini.flipkart.Dao;

import java.util.List;

import com.capgemini.flipkart.beans.ProductBean;

public interface ProductDao {
	public List<ProductBean> showAllProducts();
	public boolean buyProduct(ProductBean bean);
	public boolean searchProduct(ProductBean bean);
	

}
