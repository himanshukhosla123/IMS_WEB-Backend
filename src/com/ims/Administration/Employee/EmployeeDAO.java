package com.ims.Administration.Employee;

import static com.ims.Common.sqlQueries.ISqlQueries.ADD_EMPLOYEE;
import static com.ims.Common.sqlQueries.ISqlQueries.READ_EMPLOYEE;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;

public class EmployeeDAO {
       public int addEmployee(EmployeeDTO employeeDTO) throws ClassNotFoundException, SQLException {
		  Connection con = null;
		  PreparedStatement psmt = null;
		  int recCount;
		  try {
			  con = CommonDAO.getConnection();
			  con.setAutoCommit(false);
			  psmt = con.prepareStatement(ADD_EMPLOYEE);
			    psmt.setInt(1,employeeDTO.getEmpid());
	    		psmt.setString(2, employeeDTO.getName());
	    		psmt.setInt(3,employeeDTO.getAge());
	    		psmt.setString(4, employeeDTO.getSex());
	    		psmt.setInt(5,employeeDTO.getPhoneNo());
	    		psmt.setString(6,employeeDTO.getEmail());
	    		psmt.setString(7, employeeDTO.getPhoto());
	    		psmt.setDate(8, new java.sql.Date(employeeDTO.getDob().getTime()));
	    		psmt.setString(9, employeeDTO.getFatherName());
	    		psmt.setInt(10, employeeDTO.getFatherPhNo() );
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
    	    Connection con = null;
    	    PreparedStatement psmt = null;
    	    ResultSet rs = null;
    	    try {
    	    	con = CommonDAO.getConnection();
    	    	psmt = con.prepareStatement(READ_EMPLOYEE);
    	    	rs = psmt.executeQuery();
    	    	while(rs.next()) {
    	    		EmployeeDTO emp = new EmployeeDTO(rs.getInt(1),rs.getString(2),rs.getInt(3)
                            ,rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getDate(8)
                            ,rs.getString(9),rs.getInt(10),rs.getString(11),rs.getDate(12),rs.getInt(13),rs.getString(14));
    	    		
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
}
