package com.ims.Accounts.FeeManagement;

import java.sql.SQLException;
import java.util.ArrayList;

public class FeeController {
	
	public boolean createFee(FeeDTO feeDTO, PaymentDTO paymentDTO) {
		FeeDAO feeDAO = new FeeDAO();
		try {
			return feeDAO.addFee(feeDTO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public ArrayList<FeeDTO> readFee() {
		FeeDAO feeDAO = new FeeDAO();
		try {
			return feeDAO.readFee();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public boolean updateFee(FeeDTO feeDTO) {
		FeeDAO feeDAO = new FeeDAO();
		try {
			return feeDAO.updateFee(feeDTO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public boolean deleteFee(FeeDTO feeDTO) {
		FeeDAO feeDAO = new FeeDAO();
		try {
			return feeDAO.deleteFee(feeDTO);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	public int generatePaymentId() {
		int paymentId = 0;
		return paymentId;
	}
	
}
