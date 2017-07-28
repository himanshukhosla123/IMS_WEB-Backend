package com.ims.Administration.Employee;

import static com.ims.Common.CommonDAO.CommonDAO.getConnection;
import static com.ims.Common.sqlQueries.ISqlQueries.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class EmployeeDAO {
	Connection con = null;
	  PreparedStatement psmt = null;
       public int addEmployee(EmployeeDTO employeeDTO) throws ClassNotFoundException, SQLException {
		  
		  int recCount;
		  try {
			  con = getConnection();
			  con.setAutoCommit(false);
			  psmt = con.prepareStatement(ADD_EMPLOYEE);
			    psmt.setInt(1,employeeDTO.getEmpid());
	    		psmt.setString(2, employeeDTO.getName());
	    		psmt.setString(3,employeeDTO.getAge());
	    		psmt.setString(4, employeeDTO.getSex());
	    		psmt.setString(5,employeeDTO.getPhoneNo());
	    		psmt.setString(6,employeeDTO.getEmail());
	    		psmt.setString(7, employeeDTO.getPhoto());
	    		psmt.setDate(8, new java.sql.Date(employeeDTO.getDob().getTime()));
	    		psmt.setString(9, employeeDTO.getGuardianName());
	    		psmt.setString(10, employeeDTO.getGuardianPhNo() );
	    		psmt.setString(11,employeeDTO.getAddress());
	    		psmt.setDate(12, new java.sql.Date(employeeDTO.getDateOfJoin().getTime()));
	    		psmt.setInt(13, employeeDTO.getSalary());
	    		psmt.setString(14,employeeDTO.getStatus());
	    	
	    		
	    		recCount = psmt.executeUpdate();
	    		if(recCount>0) {
	    			con.commit();
	    		}
	    		else {
	    			con.rollback();
	    		}
		  }
		  finally {
			if(psmt!=null) {
				psmt.close();
			}
			if(con!=null) {
				con.close();
			}
		}
    	   
    	   
    	   
    	   return recCount;
    	   
       }
       public ArrayList<EmployeeDTO> readEmployee() throws ClassNotFoundException, SQLException{
    	   ArrayList<EmployeeDTO> empList = new ArrayList<>();
    	    
    	    ResultSet rs = null;
    	    try {
    	    	con = getConnection();
    	    	psmt = con.prepareStatement(READ_EMPLOYEE);
    	    	rs = psmt.executeQuery();
    	    	while(rs.next()) {
    	    		EmployeeDTO emp = new EmployeeDTO(rs.getInt(1),rs.getString(2),rs.getString(3)
                            ,rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getDate(8)
                            ,rs.getString(9),rs.getString(10),rs.getString(11),rs.getDate(12),rs.getInt(13),rs.getString(14));
    	    		
    	    		empList.add(emp);
    	    	}
    	    }
    	    finally {
    	    	if(rs!=null)
    	    		  rs.close();
    	    	  if(psmt!=null)
    	    		  psmt.close();
    	    	  if(con!=null)
    	    		  con.close();
			}
    	   return empList;
       }
       
       public boolean updateEmployee(EmployeeDTO employeeDTO) throws ClassNotFoundException, SQLException {
		try {
			con = getConnection();
			con.setAutoCommit(false);
			psmt = con.prepareStatement(UPDATE_EMPLOYEE);
			
    		psmt.setString(1, employeeDTO.getName());
    		psmt.setString(2,employeeDTO.getAge());
    		psmt.setString(3, employeeDTO.getSex());
    		psmt.setString(4,employeeDTO.getPhoneNo());
    		psmt.setString(5,employeeDTO.getEmail());
    		psmt.setString(6, employeeDTO.getPhoto());
    		psmt.setDate(7, new java.sql.Date(employeeDTO.getDob().getTime()));
    		psmt.setString(8, employeeDTO.getGuardianName());
    		psmt.setString(9, employeeDTO.getGuardianPhNo() );
    		psmt.setString(10,employeeDTO.getAddress());
    		psmt.setDate(11, new java.sql.Date(employeeDTO.getDateOfJoin().getTime()));
    		psmt.setInt(12, employeeDTO.getSalary());
    		psmt.setString(13,employeeDTO.getStatus());
			psmt.setInt(14,employeeDTO.getEmpid());

    		
    		int recCount = psmt.executeUpdate();
    		if(recCount>0) {
    			con.commit();
    			return true;
    		}
    		else {
    			con.rollback();
    			return false;
    			
    		}
		}
    	  finally {
    		  if(psmt!=null)
	    		  psmt.close();
	    	  if(con!=null)
	    		  con.close();
		} 
       }
       
       public boolean deleteEmployee(EmployeeDTO employeeDTO) throws ClassNotFoundException, SQLException {
       	try {
   		con = getConnection();
   		con.setAutoCommit(false);
            psmt = con.prepareStatement(DELETE_EMPLOYEE);
            psmt.setInt(1, employeeDTO.getEmpid());
            int recCount = psmt.executeUpdate();
            if(recCount>0) {
           	 con.commit();
           	 return true;
            }
            else {
           	 con.rollback();
           	 return false;
            }
       	}
       	finally {
   			if(psmt!=null)
   				psmt.close();
   			if(con!=null)
   				con.close();
   		}
       	
       }
}
