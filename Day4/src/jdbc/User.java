package jdbc;

public class User {
	private int id;
	private String last_name;
	private String User_name;
	private String pass_word;
	private String email;
	private long mbno;
	Roles r = new Roles();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUser_name() {
		return User_name;
	}
	public void setUser_name(String user_name) {
		User_name = user_name;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getMbno() {
		return mbno;
	}
	public void setMbno(long mbno) {
		this.mbno = mbno;
	}
	public Roles getR() {
		return r;
	}
	public void setR(Roles r) {
		this.r = r;
	}
	public User(String last_name, Roles r) {
		super();
		this.last_name = last_name;
		this.r = r;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", last_name=" + last_name + ", User_name=" + User_name + ", pass_word=" + pass_word
				+ ", email=" + email + ", mbno=" + mbno + ", r=" + r + "]";
	}
	
}
