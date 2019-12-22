package com.capgemini.flipkart.services;

import java.util.List;

import com.capgemini.flipkart.beans.ProductBean;

public interface ProductService {
	public List<ProductBean> showAllProducts();
	public boolean buyProduct(ProductBean bean);
	public boolean searchProduct(ProductBean bean);

}
