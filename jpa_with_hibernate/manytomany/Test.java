package com.cpg.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cpg.onetomany.Employee;
import com.cpg.onetomany.EmployeeOther;

public class Test {
	public static void main(String[] args){
		Employee info=new Employee();
		info.setEid(1);
		info.setEmail("dfv");
		info.setName("ghn");
		info.setPassword("1234");
		
		Employee info1=new Employee();
		info1.setEid(2);
		info1.setEmail("dfvs");
		info1.setName("ghn");
		info1.setPassword("1234");
		ArrayList<Employee>list=new ArrayList<Employee>();
		list.add(info);
		list.add(info1);
		Training t1=new Training();
		t1.setTid(21);
		t1.setTname("asdf");
		
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction transaction=null;
		EntityManager entityManager=null ;
		
		
		try {
			
			 entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(list);
			
			
		    System.out.println("Record Saved...");
		    transaction.commit();
			}catch(Exception e) {
				e.printStackTrace();
				transaction.rollback();
			}
			
			entityManager.close();

		}//end of main method

		
	}
	
	
	


