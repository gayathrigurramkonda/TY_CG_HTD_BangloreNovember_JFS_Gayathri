package com.cpapgemini.mywebapp.Dao;

import java.util.List;

import com.cpapgemini.mywebapp.bean.EmployeeInfoBean;

public interface EmployeeDao {
	public EmployeeInfoBean authenicate(int empId,String password);
	public EmployeeInfoBean SearchEmployee(int empid);
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean );
	public boolean deleteEmployee(int empid);
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean);
	public List<EmployeeInfoBean>getAllEmployees();

}
