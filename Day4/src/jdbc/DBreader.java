package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
			rs.close();
			st.close();
			// con.close();
		}catch(SQLException e) {
			System.out.println("Connection failed"+e.getMessage());
		}
		String sql1 = "select * from Departments ";  //sql command is passed as string
		String sql2 = "select count(*) from Departments ";
		try {
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql1);
			//ResultSet rs2 = st.executeQuery(sql2);
			while(rs.next()) {
				String id = rs.getString(2);
				String fname = rs.getString(4);
				System.out.println(id+ " "+ fname+" ");
			}
			rs.close();
			//rs2.close();
			st.close();
			con.close();
		}catch(SQLException e) {
			System.out.println("Connection failed"+e.getMessage());
		}
	}

}
