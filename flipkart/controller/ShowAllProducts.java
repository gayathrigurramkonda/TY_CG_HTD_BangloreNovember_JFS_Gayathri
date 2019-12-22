package com.capgemini.flipkart.controller;

import java.util.List;

import com.capgemini.flipkart.beans.ProductBean;
import com.capgemini.flipkart.factory.Factory;
import com.capgemini.flipkart.services.ProductService;

public class ShowAllProducts {
	public static void show() {
		ProductService services = Factory.instanceOfProductServices();

		List<ProductBean> list = services.showAllProducts();

		

		if (list != null) {
			for (ProductBean bean : list) {
				System.out.println(bean);
			}

		}
	}
}
