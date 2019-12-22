package com.capgemini.flipkart.factory;

import com.capgemini.flipkart.Dao.ProductDao;
import com.capgemini.flipkart.Dao.ProductDaoImpl;
import com.capgemini.flipkart.services.ProductService;
import com.capgemini.flipkart.services.ProductServiceImpl;

public class Factory 
{public static ProductDao instanceOfUserDAOImpl()
{
	   ProductDao dao= new ProductDaoImpl();//calling method present in dao and services
	   return dao;
}
public static ProductService instanceOfProductServices()
{
	   ProductService services=new ProductServiceImpl();
	   return services;
}

}
