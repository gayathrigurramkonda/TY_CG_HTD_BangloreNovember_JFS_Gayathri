package com.capgemini.flipkart.services;

import java.util.List;

import com.capgemini.flipkart.Dao.ProductDao;
import com.capgemini.flipkart.beans.ProductBean;
import com.capgemini.flipkart.factory.Factory;

public class ProductServiceImpl implements ProductService{
	ProductDao dao=Factory.instanceOfUserDAOImpl();

	@Override
	public List<ProductBean> showAllProducts() {
		return dao.showAllProducts();
	}

	@Override
	public boolean buyProduct(ProductBean bean) {
		return dao.buyProduct(bean);
	}

	@Override
	public boolean searchProduct(ProductBean bean) {
		return dao.searchProduct(bean);
	}

}
