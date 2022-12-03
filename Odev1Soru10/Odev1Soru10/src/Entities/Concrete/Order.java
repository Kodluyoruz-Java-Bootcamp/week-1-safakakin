package Entities.Concrete;

import java.util.List;

import Entities.Abstract.Entity;

public class Order implements Entity{
	private int orderId;
	private int customerId;
	private int invoiceId;
	private List<Integer> productId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public List<Integer> getProductId() {
		return productId;
	}
	public void setProductId(List<Integer> productId) {
		this.productId = productId;
	}
	public Order(int orderId, int customerId, int invoiceId, List<Integer> productId) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.invoiceId = invoiceId;
		this.productId = productId;
	}
	
	
}
