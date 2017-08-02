package com.ims.Administration.Student;

import static com.ims.Common.CommonDAO.CommonDAO.getConnection;
import static com.ims.Common.sqlQueries.ISqlQueries.*;
//import static com.ims.Common.sqlQueries.ISqlQueries.READ_STUDENT;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.codehaus.jackson.map.ObjectMapper;



public class StudentDAO {
	
	Connection con = null;
	PreparedStatement psmt = null;
    public boolean addStudent(StudentDTO studentDTO) throws ClassNotFoundException, SQLException {
    	
    	int recCount;
    	boolean isAdded = false;
    	try{
    		con = getConnection();
    		con.setAutoCommit(false);
    		psmt = con.prepareStatement(ADD_STUDENT);
    		psmt.setString(1,studentDTO.getSid());
    		psmt.setString(2,studentDTO.getName());
    		psmt.setString(3,studentDTO.getAge());
    		psmt.setString(4,studentDTO.getSex());
    		psmt.setString(5,studentDTO.getPhoneNo());
    		psmt.setString(6,studentDTO.getEmail());
    		psmt.setString(7, studentDTO.getPhotoPath());
    		psmt.setDate(8,new java.sql.Date(studentDTO.getDob().getTime()));
    		psmt.setString(9,studentDTO.getGuardianName());
    		psmt.setString(10,studentDTO.getGuardianPhNo());
    		psmt.setString(11,studentDTO.getAddress());
    		psmt.setDate(12,new java.sql.Date(studentDTO.getDateOfJoin().getTime()));
    		psmt.setString(13,studentDTO.getStatus());
    		psmt.setString(14, studentDTO.getRecommEmpId());
    		psmt.setInt(15, studentDTO.getDiscount());

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
    	return isAdded;
    	
    }
    
    public ArrayList<StudentDTO> readStudent() throws ClassNotFoundException, SQLException {
      ArrayList<StudentDTO> studentList = new ArrayList<>();	
     
      ResultSet rs = null;
      try {
    	  con = getConnection();
    	  con.setAutoCommit(false);
    	  psmt = con.prepareStatement(READ_STUDENT);
    	  rs = psmt.executeQuery();
    	  while(rs.next()) {
    		 StudentDTO stud = new StudentDTO(rs.getString(1),rs.getString(2),rs.getString(3)
    				                            ,rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getDate(8)
    				                            ,rs.getString(9),rs.getString(10),rs.getString(11),rs.getDate(12)
    				                            ,rs.getString(13),rs.getString(14),rs.getInt(15));
    	  
    	  studentList.add(stud);
    	  ObjectMapper mapper = new ObjectMapper();
    	  try {
			String json = mapper.writeValueAsString(studentList);
			System.out.println(json);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	return studentList ;
    }
    
    public boolean updateStudent(StudentDTO studentDTO) throws ClassNotFoundException, SQLException {
		try {
			con = getConnection();
			con.setAutoCommit(false);
			psmt = con.prepareStatement(UPDATE_STUDENT);
			
    		psmt.setString(1, studentDTO.getName());
    		psmt.setString(2,studentDTO.getAge());
    		psmt.setString(3, studentDTO.getSex());
    		psmt.setString(4,studentDTO.getPhoneNo());
    		psmt.setString(5,studentDTO.getEmail());
    		psmt.setString(6, studentDTO.getPhotoPath());
    		psmt.setDate(7, new java.sql.Date(studentDTO.getDob().getTime()));
    		psmt.setString(8, studentDTO.getGuardianName());
    		psmt.setString(9, studentDTO.getGuardianPhNo() );
    		psmt.setString(10,studentDTO.getAddress());
    		psmt.setDate(11, new java.sql.Date(studentDTO.getDateOfJoin().getTime()));
    		psmt.setString(12,studentDTO.getStatus());
    		psmt.setString(13, studentDTO.getRecommEmpId());
    		psmt.setInt(14, studentDTO.getDiscount());
			psmt.setString(15,studentDTO.getSid());

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
    
    public boolean deleteStudent(StudentDTO studentDTO) throws ClassNotFoundException, SQLException {
    	try {
		con = getConnection();
		con.setAutoCommit(false);
         psmt = con.prepareStatement(DELETE_STUDENT);
         psmt.setString(1, studentDTO.getSid());
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
    