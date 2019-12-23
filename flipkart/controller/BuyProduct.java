package com.capgemini.flipkart.controller;

import java.util.Scanner;

import com.capgemini.flipkart.beans.ProductBean;
import com.capgemini.flipkart.factory.Factory;
import com.capgemini.flipkart.services.ProductService;

public class BuyProduct {
	public static void buy() {
		ProductService services1=Factory.instanceOfProductServicesImpl();
		ProductBean product2=new ProductBean();
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the productId");
		product2.setProductName(sc1.nextLine());
		System.out.println("enter card number(16 digit)");
		sc1.nextLong();
		System.out.println("enter cvv number");
		sc1.nextInt();
		System.out.println("enter the address");
		sc1.nextLine();
		sc1.hasNextInt();
		System.out.println("product is baught successfully");
		int count=product2.getNumberOfProducts();
		if(count>0) {
			System.out.println("product is buyed successfully");
			
		}
		
		
		
	}

}
