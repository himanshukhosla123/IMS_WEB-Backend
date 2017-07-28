package com.ims.Administration.Employee;

import java.sql.SQLException;
import java.util.ArrayList;

public class EmployeeController {
EmployeeDAO employeeDAO = new EmployeeDAO();
	
	public void addEmployee(EmployeeDTO employeeDTO) {
		try {
			employeeDAO.addEmployee(employeeDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public ArrayList<EmployeeDTO> readEmployee(){
	 ArrayList<EmployeeDTO> readList = new ArrayList<>();
	 try {
		readList = employeeDAO.readEmployee();
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		return readList;

	}
	
	public boolean deleteEmployee(EmployeeDTO employeeDTO) {
		boolean isDeleted = false;
		try {
			 isDeleted = employeeDAO.deleteEmployee(employeeDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isDeleted;
	}
	
	public boolean updateEmployee(EmployeeDTO employeeDTO) {
		boolean isUpdated = false;
		
		try {
			isUpdated = employeeDAO.updateEmployee(employeeDTO);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return isUpdated;
	}
	
}
