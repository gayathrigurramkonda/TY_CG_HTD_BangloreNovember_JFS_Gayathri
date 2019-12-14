package com.cpg.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Insert {
	private void psvm() {
//		Employee emp=new Employee();
//		emp.setEid(1);
//		emp.setEmail("mouni@gmail.com");
//		emp.setName("mouni");
//		emp.setPassword("1234");
//		EmployeeOther other=new EmployeeOther();
//		other.setFname("shiva");
//		other.setId(2);
//		other.setId(12345);
	EntityManagerFactory entityManagerFactory=null;
		EntityTransaction transaction=null;
		EntityManager entityManager=null ;
		
		try {
			
			 entityManagerFactory=Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			Employee emp=entityManager.find(Employee.class,1);
			System.out.println(emp.getOthers().getEid());
			entityManager.persist(emp);
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
	