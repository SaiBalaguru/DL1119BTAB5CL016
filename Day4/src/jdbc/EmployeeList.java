package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeList {

	Connection con = null;
	public EmployeeList() { }
	public void listEmployees(String deptName) {
		DBCollector connector = new DBCollector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select * from employees where department_id="
				+"(select department_id from departments where department_name='"+deptName+"')"; //prepared statement runs the code there itself unlike
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery(); //ned not pass sql here since it gets executed in the initialisation
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	public void listEmployees(int dept) {
		DBCollector connector = new DBCollector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		//String sql = "select * from employees where department_id='"+dept+"'";
		String sql = "select * from employees where department_id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setInt(1, dept);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4));
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmployeeList().listEmployees("Executive");
		new EmployeeList().listEmployees(90);

	}

}
