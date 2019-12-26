package Day2Assign;

public abstract class Organisation {
	private int id;
	private String dept;
	private String city;
	private String Name;
	private int no;
	private String street;
	private String citye;
	private long pincode;
	public static String[] deptlist = {"HR","Dev","Test"};
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public void setAddress(int no, String str, String city, long pin) {
		this.no = no;
		street = str;
		this.citye = city;
		pincode = pin;
	
	}
	public String getAddress()
	{
		return ("Address: " + this.no+", " + this.street + ", "+ this.citye+", " + this.pincode+ " ");
	}

}
