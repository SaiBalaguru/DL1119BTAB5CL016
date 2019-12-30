package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

public class DBreader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;
		try {
		Class.forName("oracle.jdbc.driver.OracleDriver"); //loading driver

		}catch(ClassNotFoundException e) {
			System.out.println("Driver not found"+e.getMessage());
		}
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String username = "hr";
		String password = "hr";
		try {
			 con = DriverManager.getConnection(url,username,password); 
		}catch(SQLException e) {
			System.out.println("Connection failed: "+e.getMessage());
		}
		//database metadata
		try {
			DatabaseMetaData dbmeta = con.getMetaData();
			System.out.println(dbmeta.toString());
			System.out.println(dbmeta.getDatabaseMajorVersion());
			System.out.println(dbmeta.getDatabaseProductVersion());
		}catch(SQLException e) {
			e.printStackTrace();
		}
		String sql = "select * from Employees where last_name='King'"; //sql command is passed as string
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				String id = rs.getString("employee_id");
				String fname = rs.getString("first_name");
				String lname = rs.getString("last_name");
				System.out.println(id+ " "+ fname+" "+lname);
			}
			ResultSetMetaData rsmd = rs.getMetaData();
			int colCount = rsmd.getColumnCount();
			System.out.println(colCount);
			int type = rsmd.getColumnType(1);
			if(type==Types.INTEGER) {
				System.out.println("It's Integer type");
			}
			else if(type ==Types.VARCHAR) {
				System.out.println("It's is a String(varchar)");
			}
			else if(type == Types.NUMERIC) {
				System.out.println("It's a Numeric");
			}
			System.out.println("Using ColumnTypeName: "+rsmd.getColumnTypeName(1));
			rs.close();
			st.close();
			// con.close();
		}catch(SQLException e) {
			System.out.println("Connection failed"+e.getMessage());
		}
		String sql1 = "select * from Departments ";  //sql command is passed as string
		String sql2 = "select count(*) from Departments ";
//		try {
//			Statement st = con.createStatement();
//			ResultSet rs = st.executeQuery(sql1);
//			//ResultSet rs2 = st.executeQuery(sql2);
//			while(rs.next()) {
//				String id = rs.getString(2);
//				String fname = rs.getString(4);
//				System.out.println(id+ " "+ fname+" ");
//			}
//			rs.close();
//			//rs2.close();
//			st.close();
//			con.close();
//		}catch(SQLException e) {
//			System.out.println("Connection failed"+e.getMessage());
//		}
	}

}
