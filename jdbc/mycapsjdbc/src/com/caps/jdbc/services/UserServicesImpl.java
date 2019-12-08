package com.caps.jdbc.services;

import java.util.List;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.caps.jdbc.dao.UserDAO;

public class UserServicesImpl implements UserServices{

	UserDAO dao=UserFactory.instanceOfUserDAOImpl();
	@Override
	public List<UserBean> getAllUsers() {
		
		return dao.getAllUsers();
	}

	@Override
	public UserBean userLogin(String username, String password) {
		
		return dao.userLogin(username, password);
	}

	@Override
	public boolean updateUser(int userid, String password, String email) {
		// TODO Auto-generated method stub
		return dao.updateUser(userid, password, email);
	}

	@Override
	public boolean deleteUser(int userid, String password) {
		// TODO Auto-generated method stub
		return dao.deleteUser(userid, password);
	}

	@Override
	public boolean insertUser(UserBean user) {
		
		return dao.insertUser(user);
	}

	
}
