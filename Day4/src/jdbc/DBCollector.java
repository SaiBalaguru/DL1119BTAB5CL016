package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCollector {
	private String url;
	private String user;
	private String pass;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public DBCollector(String url, String user, String pass) {
		super();
		this.url = url;
		this.user = user;
		this.pass = pass;
	}
	@Override
	public String toString() {
		return "DBCollector [url=" + url + ", user=" + user + ", pass=" + pass + "]";
	}
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url,user,pass);
			System.out.println("Connection Success");
		}catch(SQLException e) {
			System.out.println("Connection failed"+e.getMessage());
		}
		return con;
	}
	
	public static void main(String[] args) {
		DBCollector dbcom = new DBCollector("jdbc:oracle:thin:@localhost:1521:orcl","hr","hr");
		dbcom.getConnection();
	}
}


