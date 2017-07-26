package com.ims.Management.Courses;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.ims.Common.CommonDAO.CommonDAO;
import com.ims.Common.CommonDAO.ICourseBatch;

public class CourseDAO {

	public boolean addCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(ICourseBatch.ADDCOURSE);
			ps.setString(1,courseDTO.getCourseId());
			ps.setString(2, courseDTO.getName());
			ps.setInt(3, courseDTO.getFee());
			ps.setString(4, courseDTO.getDesc());
			ps.setString(5, courseDTO.getAppDuration());
			if(ps.executeUpdate()>0)return true;
			else return false;
		}
		finally{
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
			
	}
	
	public ArrayList<CourseDTO> readCourse(CourseDTO courseDTO) throws SQLException, ClassNotFoundException{
		Connection con=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		ArrayList<CourseDTO> courseList=new ArrayList<>();
		try {
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(ICourseBatch.SELECTCOURSES);
			rs=ps.executeQuery();
			while(rs.next()) {
				courseList.add(new CourseDTO(rs.getString(1),rs.getString(2), rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
			return courseList;
		}
		finally {
			if(rs!=null)rs.close();
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
	}
	

	public boolean updateCourse(CourseDTO courseDTO) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(ICourseBatch.UPDATECOURSE);
			ps.setString(1,courseDTO.getName());
			ps.setInt(2,courseDTO.getFee());
			ps.setString(3,courseDTO.getDesc());
			ps.setString(4,courseDTO.getAppDuration());
			ps.setString(5,courseDTO.getCourseId());
			if(ps.executeUpdate()>0)return true;
			else return false;
		}
		finally {
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
	}
	
	public boolean deleteCourse(CourseDTO courseDTO) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try{
			con=CommonDAO.getConnection();
			ps=con.prepareStatement(ICourseBatch.DELETECOURSE);
			ps.setString(1, courseDTO.getCourseId());
			if(ps.executeUpdate()>0)return true;
			else return false;
		}
		finally {
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
		
	}

	
}
