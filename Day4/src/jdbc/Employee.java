package jdbc;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee {
	String fName;
	String lname;
	int eId;
	double salary;
	Date joinDate;
	int dId;
	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");		
		return "Employee [fName=" + fName + ", lname=" + lname + ", eId=" + eId + ", salary=" + salary + ", joinDate="
				+ sdf.format(joinDate) + ", dId=" + dId + "]";
	}
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getEId() {
		return eId;
	}
	public void setEId(int EId) {
		this.eId = EId;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Employee(String fName, String lname,Date date, int eId,int dId,  double salary) {
		super();
		this.fName = fName;
		this.lname = lname;
		this.eId = eId;
		this.dId = dId;
		this.salary = salary;
		joinDate = date;
	}
	

}
