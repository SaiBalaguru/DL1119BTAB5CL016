package jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


public class EmpHireDateSort {
	Connection con = null;
	public void listEmpUsingHireDate(String sdate, String edate) {
		DBCollector connector = new DBCollector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		//ArrayList<String> count = new ArrayList<>();
		ArrayList<Employee> list = new ArrayList<>();
		String sql = "select first_name, last_name, to_char(hire_date,'DD-MM-YYYY'),employee_id,Department_id,salary from employees "
				+ "where hire_date < ? and hire_date > ?"; //prepared statement runs the code there itself unlike
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, sdate);
			pst.setString(2, edate);
			ResultSet rs = pst.executeQuery(); //ned not pass sql here since it gets executed in the initialisation
			while(rs.next()) {
//				System.out.println(rs.getString(1)+" "+rs.getString(2));
//				count.add(rs.getString(1)+" "+rs.getString(2));
				SimpleDateFormat sdf = new SimpleDateFormat("DD-MM-YYYY");
				Date date = null;
				try {
					 date = sdf.parse(rs.getString(3));
				}catch(ParseException e) {
					System.out.println(e.getMessage());
				}
				list.add(new Employee(rs.getString(1),rs.getString(2),date,rs.getInt(4),rs.getInt(5),rs.getDouble(6)));
			}
			
		}catch(SQLException e) {
			System.out.println(e);
		}
		System.out.println("The number of employees hired in the specified date are: 0"+ list.size());
		int temp = 0;
		for(Employee e: list) {
			++temp;
			System.out.println(temp+" " +e);
		}
	}
	
	public static void main(String[] args) {
		new EmpHireDateSort().listEmpUsingHireDate("17-DEC-08", "20-JAN-06");
	}
}
