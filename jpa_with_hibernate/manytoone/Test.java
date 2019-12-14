package com.cpg.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.cpg.onetomany.Employee;
import com.cpg.onetomany.EmployeeOther;

public class Test {
	private void psvm() {
		Employee emp=new Employee();
		emp.setEid(1);
		emp.setEmail("mouni@gmail.com");
		emp.setName("mouni");
		emp.setPassword("1234");
		
		EmployeeOther other=new EmployeeOther();
		other.setFname("shiva");
		other.setId(2);
		other.setId(12345);
		EntityManagerFactory entityManagerFactory=null;
		EntityTransaction transaction=null;
		EntityManager entityManager=null ;
		
		try {
			
			 entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			entityManager.persist(other);
		    System.out.println("Record Saved...");
		    transaction.commit();
			}catch(Exception e) {
				e.printStackTrace();
				transaction.rollback();
			}
			transaction.commit();
			entityManager.close();

		}//end of main method


	}
	


