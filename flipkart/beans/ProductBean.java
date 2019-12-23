package com.capgemini.flipkart.beans;

public class ProductBean {
	private int productId;
	private String ProductName;
	private double productCost;
	private String productColor;
	private String description;
	private int numberOfProducts;
	public synchronized int getProductId() {
		return productId;
	}
	public synchronized void setProductId(int productId) {
		this.productId = productId;
	}
	public synchronized String getProductName() {
		return ProductName;
	}
	public synchronized void setProductName(String productName) {
		ProductName = productName;
	}
	public synchronized double getProductCost() {
		return productCost;
	}
	public synchronized void setProductCost(double productCost) {
		this.productCost = productCost;
	}
	public synchronized String getProductColor() {
		return productColor;
	}
	public synchronized void setProductColor(String productColor) {
		this.productColor = productColor;
	}
	public synchronized String getDescription() {
		return description;
	}
	public synchronized void setDescription(String description) {
		this.description = description;
	}
	public synchronized int getNumberOfProducts() {
		return numberOfProducts;
	}
	public synchronized void setNumberOfProducts(int numberOfProducts) {
		this.numberOfProducts = numberOfProducts;
	}
	@Override
	public String toString() {
		return "ProductBean [productId=" + productId + ", ProductName=" + ProductName + ", productCost=" + productCost
				+ ", productColor=" + productColor + ", description=" + description + ", numberOfProducts="
				+ numberOfProducts + "]";
	}
	
	
	

}
