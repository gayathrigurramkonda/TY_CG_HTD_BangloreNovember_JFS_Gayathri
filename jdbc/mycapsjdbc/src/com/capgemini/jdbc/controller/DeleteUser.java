package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.caps.jdbc.services.UserServices;

public class DeleteUser {
	public static void main(String[] args) {
		UserServices services=UserFactory.instanceOfUserServices();
		UserBean user=new UserBean();
		Scanner sc=new Scanner(System.in);
		System.out.println("enter Userid...");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.println("enter password");
		user.setPassword(sc.nextLine());
		boolean result=services.deleteUser(user.getUserid(),user.getPassword());
		if(result){
			System.out.println("user deleted");
		}else {
			System.err.println("something is wrong");
		}
		sc.close();
	}
	

}
