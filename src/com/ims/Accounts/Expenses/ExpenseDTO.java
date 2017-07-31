package com.ims.Accounts.Expenses;

import java.util.Date;

public class ExpenseDTO {
	
//VIEWABLE IN THE MAIN SCREEN ARE MARKED BY 'OK' AFTER THEM
	private String expenseID; //OK
	private Date date; //OK								
	private String category; //OK
	private String description;
	private String EID; //OK - APPARENTLY EMPLOYEE NAME
	private double expenditure; //OK
	private double advance;
	private String paymentMode;
	private String chequeID;
	private double balance;
	private String status; //OK

	public ExpenseDTO(String expenseID, Date date, String category, String eID, double expenditure, String status) {
		super();
		this.expenseID = expenseID;
		this.date = date;
		this.category = category;
		EID = eID;
		this.expenditure = expenditure;
		this.status = status;
	}

	public ExpenseDTO(String expenseID, Date date, String category, String description, String eID, double expenditure,
			double advance, String paymentMode, String chequeID, double balance, String status) {
		this.expenseID = expenseID;
		this.date = date;
		this.category = category;
		this.description = description;
		this.EID = eID;
		this.expenditure = expenditure;
		this.advance = advance;
		this.paymentMode = paymentMode;
		this.chequeID = chequeID;
		this.balance = balance;
		this.status = status;
	}

	@Override
	public String toString() {
		return "PaymentDTO [expenseID=" + expenseID + ", date=" + date + ", category=" + category + ", description="
				+ description + ", EID=" + EID + ", expenditure=" + expenditure + ", advance=" + advance
				+ ", paymentMode=" + paymentMode + ", chequeID=" + chequeID + ", balance=" + balance + "]";
	}

	public String getExpenseID() {
		return expenseID;
	}

	public void setExpenseID(String expenseID) {
		this.expenseID = expenseID;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getEID() {
		return EID;
	}

	public void setEID(String eID) {
		this.EID = eID;
	}

	public double getExpenditure() {
		return expenditure;
	}

	public void setExpenditure(double expenditure) {
		this.expenditure = expenditure;
	}

	public double getAdvance() {
		return advance;
	}

	public void setAdvance(double advance) {
		this.advance = advance;
	}

	public String getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getChequeID() {
		return chequeID;
	}

	public void setChequeID(String chequeID) {
		this.chequeID = chequeID;
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
