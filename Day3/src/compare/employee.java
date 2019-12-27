package compare;

import java.util.Comparator;

public class employee implements Comparable<employee>, Comparator<employee> {
	private String name;
	private int id;
	private double salary;
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public employee(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + ", Salary = " +salary + "]";
	}
	@Override
	public boolean equals(Object o) {
		employee e = (employee)o;
		//return (this.id==e.id);
		return (this.hashCode()==e.hashCode());
	}
	@Override
	public int hashCode() {
		return (this.id)/12;
	}
	@Override
	public int compareTo(employee arg0) {
		return (this.id - arg0.id);
	}
	@Override
	public int compare(employee e1, employee e2) {
		// TODO Auto-generated method stub
		return e1.name.compareTo(e2.name);
	}
	
	

}
