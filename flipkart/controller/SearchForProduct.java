package com.capgemini.flipkart.controller;

import java.util.Scanner;

import com.capgemini.flipkart.beans.ProductBean;
import com.capgemini.flipkart.factory.Factory;
import com.capgemini.flipkart.services.ProductService;

public class SearchForProduct {
public static void show() {
	ProductService services=Factory.instanceOfProductServicesImpl();
	ProductBean product=new ProductBean();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the productName");
	product.setProductName(sc.nextLine());
	ProductBean product1=services.searchProduct(product.getProductName());
	
	System.out.println("press 1 to buy the product");
	System.out.println("press 2 to search again");
	System.out.println("press 3 to go back to last menu");
	System.out.println("Enter your choice");
	int choice;
	choice= Integer.parseInt(sc.nextLine());
	
	do {
		switch(choice)
		{
		case 1 :
			
			BuyProduct.buy();
			break;
          
		case 2:
			ProductService services1=Factory.instanceOfProductServicesImpl();
			ProductBean product2=new ProductBean();
			Scanner sc1=new Scanner(System.in);
			System.out.println("Enter the productName");
			product.setProductName(sc.nextLine());
			ProductBean product3=services.searchProduct(product.getProductName());
			break;
		case 3:
			App.main(null);
			break;
	}
	
	}while(!sc.hasNextLine());
	sc.close();
}
	
                
	


}

