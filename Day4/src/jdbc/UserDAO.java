package jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class UserDAO {
	Connection con = null;
	ArrayList<Roles> roles = new ArrayList<>();
	ArrayList<User> users = new ArrayList<>();
	public void listUsers(int id) {
		DBCollector connector = new DBCollector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select u.role_id,r.role_name,u.last_name,u.pass_word from roles r join users u on u.role_id=r.role_id";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				roles.add(new Roles(rs.getInt(1),rs.getString(2)));
				User u = new User(rs.getString(3),new Roles(rs.getInt(1),rs.getString(2)));
				u.setPass_word(rs.getString(4));
				users.add(u);
				
			}	
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
		for(User u: users) {
			if(u.r.getRole_id()==id) {
				System.out.print("Name: "+u.getLast_name()+"\nRole Name: "+u.r.getRole_name()+"\nRole Id "+id+"\nPassword: ");
				printPW(u.getPass_word());
			}
		}
	}
	public static void printPW(String s) {
		for(int i = 0;i<s.length();i++) {
			System.out.print('*');
		}
		System.out.println();
	}
	public void findRole(String s) {
		DBCollector connector = new DBCollector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		con = connector.getConnection();
		String sql = "select u.last_name,r.role_name from roles r join users u on r.role_id = u.role_id";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				String name = rs.getString(1);
				if(name.equalsIgnoreCase(s)) {
					System.out.println("The role of "+s+" is "+rs.getString(2));
				}
				
			}	
		}catch(SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new UserDAO().listUsers(30);
		new UserDAO().findRole("Ram");

	}

}
