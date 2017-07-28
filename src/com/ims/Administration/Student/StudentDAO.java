package com.ims.Administration.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import static com.ims.Common.sqlQueries.ISqlQueries.ADD_STUDENT;
import static com.ims.Common.sqlQueries.ISqlQueries.READ_STUDENT;


public class StudentDAO {
    public int addStudent(StudentDTO studentDTO) throws ClassNotFoundException, SQLException {
    	Connection con = null;
    	PreparedStatement psmt = null;
    	int recCount;
    	try{
    		con = CommonDAO.getConnection();
    		con.setAutoCommit(false);
    		psmt = con.prepareStatement(ADD_STUDENT);
    		psmt.setInt(1,studentDTO.getSid());
    		psmt.setString(2,studentDTO.getName());
    		psmt.setInt(3,studentDTO.getAge());
    		psmt.setString(4,studentDTO.getSex());
    		psmt.setInt(5,studentDTO.getPhoneNo());
    		psmt.setString(6,studentDTO.getEmail());
    		psmt.setString(7, studentDTO.getPhotoPath());
    		psmt.setDate(8,new java.sql.Date(studentDTO.getDob().getTime()));
    		psmt.setString(9,studentDTO.getFatherName());
    		psmt.setInt(10,studentDTO.getFatherPhNo());
    		psmt.setString(11,studentDTO.getAddress());
    		psmt.setDate(12,new java.sql.Date(studentDTO.getDateOfJoin().getTime()));
    		psmt.setString(13,studentDTO.getStatus());

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
    
    public ArrayList<StudentDTO> readStudent() throws ClassNotFoundException, SQLException {
      ArrayList<StudentDTO> studentList = new ArrayList<>();	
      Connection con = null;
      PreparedStatement psmt = null;
      ResultSet rs = null;
      try {
    	  con = CommonDAO.getConnection();
    	  con.setAutoCommit(false);
    	  psmt = con.prepareStatement(READ_STUDENT);
    	  rs = psmt.executeQuery();
    	  while(rs.next()) {
    		 StudentDTO stud = new StudentDTO(rs.getInt(1),rs.getString(2),rs.getInt(3)
    				                            ,rs.getString(4),rs.getInt(5),rs.getString(6),rs.getString(7),rs.getDate(8)
    				                            ,rs.getString(9),rs.getInt(10),rs.getString(11),rs.getDate(12),rs.getString(13));
    	  
    	  studentList.add(stud);
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
}
    