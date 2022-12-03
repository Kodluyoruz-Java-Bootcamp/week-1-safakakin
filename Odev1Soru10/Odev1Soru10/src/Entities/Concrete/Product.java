package Entities.Concrete;

import Entities.Abstract.Entity;

public class Product implements Entity{
	
	private int productId;
	private String name;
	private double price;
	private int stockLevel;
	private int categoryId;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockLevel() {
		return stockLevel;
	}
	public void setStockLevel(int stockLevel) {
		this.stockLevel = stockLevel;
	}
	public int getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}
	public Product(int productId, String name, double price, int stockLevel, int categoryId) {
		super();
		this.productId = productId;
		this.name = name;
		this.price = price;
		this.stockLevel = stockLevel;
		this.categoryId = categoryId;
	}
	
	
	
	
}
