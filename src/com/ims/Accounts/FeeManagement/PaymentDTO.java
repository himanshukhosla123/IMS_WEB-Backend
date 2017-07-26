package com.ims.Accounts.FeeManagement;

import java.util.Date;

public class PaymentDTO {
	
	private int stuPaymentId;
	private double payment;
	private Date paymentDate;
	private Date dueDate;
	public int getPaymentID() {
		return stuPaymentId;
	}
	public void setPaymentID(int stuPaymentId) {
		this.stuPaymentId = stuPaymentId;
	}
	public double getPayment() {
		return payment;
	}
	public void setPayment(double payment) {
		this.payment = payment;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
	@Override
	public String toString() {
		return "PaymentDTO [paymentID=" + stuPaymentId + ", payment=" + payment + ", paymentDate=" + paymentDate
				+ ", dueDate=" + dueDate + "]";
	}

}
