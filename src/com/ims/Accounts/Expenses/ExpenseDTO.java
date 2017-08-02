package com.ims.Accounts.Expenses;

import java.util.Date;

/**
 * <h1>Expense DTO</h1>
 * This is just a object that contains variables,
 * string generator and a constructor.
 * <p>
 * <b>Note:</b> It is also used to make entry into tables
 *
 * @author  Hitesh Sharma
 * @version 1.0
 * @since   2017-07-30
 */
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

	/**
	 * This method is called constructor and is used
	 * to initialize the variables
	 * @param expenseID This is the first parameter to addNum method
	 * @param date Date on which expense is made
	 * @param category Type/Category of expense
	 * @param description Description of the expense
	 * @param EID Id of the employee that made the expense
	 * @param expenditure Total expense made on the day
	 * @param advance Advance payment for the expense
	 * @param paymentMode The mode in which the payment is made
	 * @param chequeID Id of the cheque through which payment is done(if any) 
	 * @param balance The amount remaining to be paid
	 * @param status The status of the expense on this day
	 * @return Nothing
	 */
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

	/**
	 * Overridden method to display data in object
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentDTO [expenseID=" + expenseID + ", date=" + date + ", category=" + category + ", description="
				+ description + ", EID=" + EID + ", expenditure=" + expenditure + ", advance=" + advance
				+ ", paymentMode=" + paymentMode + ", chequeID=" + chequeID + ", balance=" + balance + "]";
	}

	/**
	 * This is the getter method for Expense Id
	 * @return String Expense Id
	 */
	public String getExpenseID() {
		return expenseID;
	}

	/**
	 * This is the setter method for Expense Id
	 * @return Nothing
	 */
	public void setExpenseID(String expenseID) {
		this.expenseID = expenseID;
	}

	/**
	 * This is the getter method for current Date object
	 * @return String Expense Id
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * This is the setter method for current Date object
	 * @return Nothing
	 */
	public void setDate(Date date) {
		this.date = date;
	}

	/**
	 * This is the getter method for category of expense
	 * @return String Expense Id
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * This is the setter method for category of expense
	 * @return Nothing
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * This is the getter method for description of expense
	 * @return String Expense Id
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This is the setter method for description of expense
	 * @return Nothing
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * This is the getter method for Employee Id
	 * @return String Expense Id
	 */
	public String getEID() {
		return EID;
	}

	/**
	 * This is the setter method for Employee Id
	 * @return Nothing
	 */
	public void setEID(String eID) {
		this.EID = eID;
	}

	/**
	 * This is the getter method for expenses made
	 * @return String Expense Id
	 */
	public double getExpenditure() {
		return expenditure;
	}

	/**
	 * This is the setter method for expenses made
	 * @return Nothing
	 */
	public void setExpenditure(double expenditure) {
		this.expenditure = expenditure;
	}

	/**
	 * This is the getter method for Expense Id
	 * @return String Expense Id
	 */
	public double getAdvance() {
		return advance;
	}

	/**
	 * This is the setter method for Expense Id
	 * @return Nothing
	 */
	public void setAdvance(double advance) {
		this.advance = advance;
	}

	/**
	 * This is the getter method for Expense Id
	 * @return String Expense Id
	 */
	public String getPaymentMode() {
		return paymentMode;
	}

	/**
	 * This is the setter method for Expense Id
	 * @return Nothing
	 */
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}

	/**
	 * This is the getter method for Expense Id
	 * @return String Expense Id
	 */
	public String getChequeID() {
		return chequeID;
	}

	/**
	 * This is the setter method for Expense Id
	 * @return Nothing
	 */
	public void setChequeID(String chequeID) {
		this.chequeID = chequeID;
	}

	/**
	 * This is the getter method for Expense Id
	 * @return String Expense Id
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * This is the setter method for Expense Id
	 * @return Nothing
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	/**
	 * This is the getter method for Expense Id
	 * @return String Expense Id
	 */
	public String getStatus() {
		return status;
	}
	
	/**
	 * This is the setter method for Expense Id
	 * @return Nothing
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
