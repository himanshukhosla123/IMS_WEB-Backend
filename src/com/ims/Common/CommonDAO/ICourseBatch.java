package com.ims.Common.CommonDAO;

public interface ICourseBatch {

	String ADDCOURSE="INSERT INTO `course`(`COURSEID`, `Course name`, `Course fees`, `Course desc`, `Approx duration`) VALUES (?,?,?,?,?);";
	String UPDATECOURSE="UPDATE `course` SET `Course name`=?,`Course fees`=?,`Course desc`=?,`Approx duration`=?  WHERE `COURSEID`=?;";
	String DELETECOURSE="DELETE FROM `course` WHERE `COURSEID`=?;";
	String SELECTCOURSES="SELECT * FROM `course` WHERE 1;";
	String COURSEHASBATCHES="SELECT COURSEID,BATCHID from 'batch' group by COURSEID";
	String ADDBATCH="INSERT INTO `batch`(`BATCHID`, `Number of students`, `COURSEID`, `Timing`, `Class days`, `Class mode`) VALUES (?,?,?,?,?,?);";
	String UPDATEBATCH="UPDATE `batch` SET `Number of students`=?,`Timing`=?,`Class days`=?,`Class mode`=? WHERE `BATCHID`=? AND `COURSEID`=?;";
	String DELETEBATCH="DELETE FROM `batch` WHERE `BATCHID`=?;";
	String SELECTBATCH="SELECT * FROM `batch` WHERE 1;";
}
