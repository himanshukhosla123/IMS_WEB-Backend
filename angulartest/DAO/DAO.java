package com.mvc.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.mvc.DTO.DTO;
import com.ims.Common.CommonDAO.CommonDAO;
public class DAO {
      
	 
	   
	   public void store(DTO dto) throws ClassNotFoundException, SQLException {
		   Connection con = null;
		   PreparedStatement psmt = null;
		   
		   String query = "insert into result values (?,?,?);";
		   con = CommonDAO.getConnection();
		   psmt = con.prepareStatement(query);
		   psmt.setInt(1, dto.getFirst());
		   psmt.setInt(2, dto.getSecond());
		   psmt.setInt(3, dto.getResult());
		 
		   psmt.executeUpdate();
	   }
}
