package angulartest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ims.Common.CommonDAO.CommonDAO;

public class ResultDAO {

//	public Connection getConnection() throws SQLException, ClassNotFoundException {
//		   String dburl="jdbc:mysql://localhost:3306/imsweb";
//		   Class.forName("com.mysql.jdbc.Driver");
//		   Connection con=DriverManager.getConnection(dburl,"root","");
//		   return con;
//	}
	
	public boolean addResult(ResultDTO resultDTO) throws ClassNotFoundException, SQLException {
		Connection con=null;
		PreparedStatement ps=null;
		try {
			con=CommonDAO.getConnection();
			ps=con.prepareStatement("INSERT INTO `result`(`firstnum`, `secondnum`, `result`) VALUES(?,?,?);");
			ps.setInt(1, resultDTO.getFirstNum());
			ps.setInt(2, resultDTO.getSecondNum());
			ps.setInt(3, resultDTO.getResult());
			if(ps.executeUpdate()>0)return true;
			else return false;
		}
		finally {
			if(ps!=null)ps.close();
			if(con!=null)con.close();
		}
	}
	
}
