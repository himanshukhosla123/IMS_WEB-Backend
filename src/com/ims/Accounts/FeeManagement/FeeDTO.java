package com.ims.Accounts.FeeManagement;

import java.util.Date;

public class FeeDTO {
	
//VIEWABLE IN THE MAIN SCREEN ARE MARKED BY 'OK' AFTER THEM
	private String TID;
	private String SID; //OK
	private String BID; 
	private String CID; //OK - APPARENTLY COURSE NAMR
	private double courseAmount; //ORIGINAL COURSE AMOUNT
	private double payableAmount; //PAYABLE AMOUNT AFTER OFFER AND DISCOUNT
	private String paymentMode;
	private String ChequeId;
	private String paymentDate;
	private String installmentDate;
	private double payment; // AMOUNT PAID ON PAYMENT_DATE
	private double balance; // AMOUNT REMAINING
	private String status;

	public FeeDTO() {	
	}
	
	public FeeDTO(String tID, String sID, String cID, double payableAmount, String installmentDate, double balance,
			String status) {
		super();
		TID = tID;
		SID = sID;
		CID = cID;
		this.payableAmount = payableAmount;
		this.installmentDate = installmentDate;
		this.balance = balance;
		this.status = status;
	}

	public FeeDTO(String tID, String sID, String bID, String cID, double courseAmount, double payableAmount,
			String paymentMode, String chequeId, String paymentDate, String installmentDate, double payment, double balance,
			String status) {
		super();
		TID = tID;
		SID = sID;
		BID = bID;
		CID = cID;
		this.courseAmount = courseAmount;
		this.payableAmount = payableAmount;
		this.paymentMode = paymentMode;
		ChequeId = chequeId;
		this.paymentDate = paymentDate;
		this.installmentDate = installmentDate;
		this.payment = payment;
		this.balance = balance;
		this.status = status;
	}

	@Override
	public String toString() {
		return "FeeDTO [TID=" + TID + ", SID=" + SID + ", BID=" + BID + ", CID=" + CID + ", courseAmount="
				+ courseAmount + ", payableAmount=" + payableAmount + ", paymentMode=" + paymentMode + ", ChequeId="
				+ ChequeId + ", paymentDate=" + paymentDate + ", installmentDate=" + installmentDate + ", payment="
				+ payment + ", balance=" + balance + ", status=" + status + "]";
	}

	public String getTID() {
		return TID;
	}

	public void setTID(String tID) {
		TID = tID;
	}

	public String getSID() {
		return SID;
	}

	public void setSID(String sID) {
		SID = sID;
	}

	public String getBID() {
		return BID;
	}

	public void setBID(String bID) {
		BID = bID;
	}

	public String getCID() {
		return CID;
	}

	public void setCID(String cID) {
		CID = cID;
	}

	public double getCourseAmount() {
		return courseAmount;
	}

	public void setCourseAmount(double courseAmount) {
		this.courseAmount = courseAmount;
	}

	public double getPayableAmount() {
		return payableAmount;
	}

	public void setPayableAmount(double payableAmount) {
		this.payableAmount = payableAmount;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getChequeId() {
		return ChequeId;
	}

	public void setChequeId(String chequeId) {
		ChequeId = chequeId;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getInstallmentDate() {
		return installmentDate;
	}

	public void setInstallmentDate(String installmentDate) {
		this.installmentDate = installmentDate;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
