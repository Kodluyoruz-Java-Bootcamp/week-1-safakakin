package Entities.Concrete;

import Entities.Abstract.Entity;

public class Invoice implements Entity{
	private int invoiceId;
	private int orderId;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	private double invoiceAmount;
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public double getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(double invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	public Invoice(int invoiceId, double invoiceAmount,int orderId) {
		super();
		this.invoiceId = invoiceId;
		this.invoiceAmount = invoiceAmount;
		this.orderId=orderId;
	}
	
	

}
