package com.cpapgemini.mywebapp.service;

import java.util.List;

import com.cpapgemini.mywebapp.bean.EmployeeInfoBean;

public interface EmployeeService {

	public EmployeeInfoBean searchEmployee(int empId);
	public EmployeeInfoBean authenicate(int empId,String password);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean );
	public boolean deleteEmployee(int empid);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	public List<EmployeeInfoBean>getAllEmployees();


}
