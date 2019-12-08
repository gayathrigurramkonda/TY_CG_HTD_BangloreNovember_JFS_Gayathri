package com.capgemini.jdbc.factory;


import com.caps.jdbc.dao.UserDAOImpl;
import com.caps.jdbc.services.UserServices;
import com.caps.jdbc.services.UserServicesImpl;

public class UserFactory {
	private UserFactory() {
		
	}
	public static UserDAOImpl instanceOfUserDAOImpl() {
		UserDAOImpl dao=new UserDAOImpl();
		return dao;
		
	}
	public static  UserServices instanceOfUserServices() {
		UserServices services=new UserServicesImpl(); 
		return services;
	}

}
