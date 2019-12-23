package com.cpapgemini.mywebapp.service;

import java.util.List;

import com.cpapgemini.mywebapp.Dao.EmployeeDao;
import com.cpapgemini.mywebapp.Dao.EmployeeDaoImpl;
import com.cpapgemini.mywebapp.bean.EmployeeInfoBean;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao dao=new EmployeeDaoImpl();

	
	@Override
	public EmployeeInfoBean searchEmployee(int empId) {
	
		return dao.SearchEmployee(empId);
	}


	@Override
	public EmployeeInfoBean authenicate(int empId, String password) {
	
		return dao.authenicate(empId, password);
	}


	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return dao.addEmployee(employeeInfoBean);
	}


	@Override
	public boolean deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		return dao.deleteEmployee(empid);
	}


	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		// TODO Auto-generated method stub
		return dao.updateEmployee(employeeInfoBean);
	}


	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		// TODO Auto-generated method stub
		return dao.getAllEmployees();
	}


	



}
