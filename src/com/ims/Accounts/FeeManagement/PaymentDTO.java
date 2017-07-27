package com.ims.Accounts.FeeManagement;

import java.util.Date;

public class PaymentDTO {
	
	private int stuFeeId;
	private double payment;
	private Date paymentDate;
	private Date dueDate;
	public int getStuFeeID() {
		return stuFeeId;
	}
	public void setStuFeeID(int stuFeeId) {
		this.stuFeeId = stuFeeId;
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
		return "PaymentDTO [stuFeeID=" + stuFeeId + ", payment=" + payment + ", paymentDate=" + paymentDate
				+ ", dueDate=" + dueDate + "]";
	}
	public PaymentDTO(int stuFeeId, double payment, Date paymentDate, Date dueDate) {
		super();
		this.stuFeeId = stuFeeId;
		this.payment = payment;
		this.paymentDate = paymentDate;
		this.dueDate = dueDate;
	}

}
