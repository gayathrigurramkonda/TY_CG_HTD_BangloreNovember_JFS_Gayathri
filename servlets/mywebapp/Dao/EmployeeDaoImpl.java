package com.cpapgemini.mywebapp.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cpapgemini.mywebapp.bean.EmployeeInfoBean;

public class EmployeeDaoImpl implements EmployeeDao{
	private EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Test");
	@Override
	public EmployeeInfoBean SearchEmployee(int empid) {
		EntityManager manager=entityManagerFactory.createEntityManager();
		EmployeeInfoBean employeeInfoBean=manager.find(EmployeeInfoBean.class, empid);
		manager.close();
		return employeeInfoBean;


	}
	@Override
	public EmployeeInfoBean authenicate(int empId, String password) {
		EntityManager manager=entityManagerFactory.createEntityManager();
		String jpql=" from EmployeeInfoBean where empId=:empId and password=:pwd";
		Query query=manager.createQuery(jpql);
		query.setParameter("empId", empId);
		query.setParameter("pwd", password);
		query.getSingleResult();
		EmployeeInfoBean employeeInfoBean=null;
		try {
			employeeInfoBean=(EmployeeInfoBean)query.getSingleResult();//throws exception as result not found exception
		}catch(Exception e) {
			e.printStackTrace();		
		}
		manager.close();
		return employeeInfoBean;//return null if pwd doesnt match

	}
	@Override
	public boolean addEmployee(EmployeeInfoBean employeeInfoBean) {
		boolean isAdded=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EntityTransaction transaction=null;
		try {
			transaction=manager.getTransaction();
			transaction.begin();
			manager.persist(employeeInfoBean);
			transaction.commit();
			isAdded=true;
		}catch(Exception e) {
			e.printStackTrace();
		}
		manager.close();
		return isAdded;
	}
	@Override
	public boolean deleteEmployee(int empid) {
		boolean isDeleted=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EmployeeInfoBean employeeInfoBean=manager.find(EmployeeInfoBean.class,empid );
		EntityTransaction transaction=null;
		if(employeeInfoBean !=null) {
			transaction.begin();
			manager.remove(employeeInfoBean);
			transaction.commit();
			isDeleted=true;
		}
		manager.close();
		return isDeleted;
	}
	@Override
	public boolean updateEmployee(EmployeeInfoBean employeeInfoBean) {
		boolean isUpdated=false;
		EntityManager manager=entityManagerFactory.createEntityManager();
		EmployeeInfoBean existingemployeeInfo=manager.find(EmployeeInfoBean.class,employeeInfoBean);
		EntityTransaction transaction=manager.getTransaction();
		if(existingemployeeInfo!=null) {
			try {
				transaction.begin();
				String newName=employeeInfoBean.getName().trim();
				if(newName!=null && !newName.isEmpty()) {
					existingemployeeInfo.setName(newName);
				}
				int newAge=employeeInfoBean.getAge();
				if(newAge>18) {
					existingemployeeInfo.setAge(newAge);
				}
				double newSalary=employeeInfoBean.getSalary();
				if(newSalary>0) {
					existingemployeeInfo.setSalary(newSalary);
				}
				String newDesignation=employeeInfoBean.getDesignation();
				if(newDesignation!=null && !newDesignation.isEmpty()) {

					existingemployeeInfo.setDesignation(newDesignation);
				}
				String newPassword=employeeInfoBean.getPassword();
				if(newPassword!=null&& !newPassword.isEmpty()) {
					existingemployeeInfo.setPassword(newPassword);
				}
				transaction.commit();
				isUpdated=true;
			}catch(Exception e) {
				e.printStackTrace();
			}

		}
		manager.close();
		return isUpdated;

	}
	@Override
	public List<EmployeeInfoBean> getAllEmployees() {
		EntityManager manager=entityManagerFactory.createEntityManager();
		String jpql="from EmployeeInfoBean";
		Query query=manager.createQuery(jpql);
		List<EmployeeInfoBean> employeeList=query.getResultList();
		manager.close();
		return employeeList;
	}


}

