package FinalAssignment;

public class Employee  {
	private String name;
	private String id;
	private double salary;
	Role role = new Role();
	Department dpt;
	Employee manager;
	
	Employee(){
		
	}
	public Employee(String name, String id, double salary, Department dept, Employee mng, String role) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		dpt = dept;
		manager = mng;
		this.role.setRole(role);
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + ", dept=" + this.dpt.getDeptName() + ", mng=" + this.manager.name + ", Role="+this.role.getRole()+ " ]";
	}
	public String getName() {
		return name;
	}
	public String getId() {
		return id;
	}
	public double getSalary() {
		return salary;
	}
	public String getMng() {
		return this.manager.name;
	}
	

}
