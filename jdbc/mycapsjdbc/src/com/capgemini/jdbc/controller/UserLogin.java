package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.caps.jdbc.services.UserServices;

public class UserLogin {

	public static void main(String[] args) {
		UserServices services=UserFactory.instanceOfUserServices();
		Scanner sc=new Scanner(System.in);
     UserBean user=new UserBean();
     System.out.println("enter username");
     user.setName(sc.nextLine());
     System.out.println("enter password");  
     user.setPassword(sc.nextLine());
     UserBean user1=services.userLogin(user.getName(), user.getPassword());
     if(user1!=null) {
    	 System.out.println("user id is"+user1.getUserid());
    	 System.out.println("user name is"+user1.getName());
    	 System.out.println("user email is"+user1.getEmail());
     }
     else {
    	 System.out.println("something went wrong");
     }
     

	}

}
