package Entities.Concrete;

import java.util.List;

import Entities.Abstract.Entity;

public class Customer implements Entity {
	private int customerId;
	private String customerName;
	private List<Integer> orderId;
	
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	private int customerAge;
	
	
	public int getCustomerAge() {
		return customerAge;
	}
	public void setCustomerAge(int customerAge) {
		this.customerAge = customerAge;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public List<Integer> getOrderId() {
		return orderId;
	}
	public void setOrderId(List<Integer> orderId) {
		this.orderId = orderId;
	}
	public Customer(int customerId, List<Integer> orderId,int customerAge, String customerName) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.customerAge = customerAge;
		this.customerName=customerName;
	}
	
}
