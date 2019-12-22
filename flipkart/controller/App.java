package com.capgemini.flipkart.controller;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		System.out.println("press 1 to show all the Items");
		System.out.println("press 2 to search for an Item");
		int choice ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choice");
		choice = Integer.parseInt(sc.nextLine());
		
		do {
			switch(choice)
			{
			case 1 :
				ShowAllProducts.show();
				break;
	          
			case 2:
				SearchForProduct.show();
				break;
		}
		
		}while(!sc.hasNextLine());
		sc.close();
	}

}
