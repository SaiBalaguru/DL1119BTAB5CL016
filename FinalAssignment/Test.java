package FinalAssignment;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employee> list = new ArrayList<>();
		Department hyd = new Department();
		Department che = new Department();
		hyd.setDeptName("A");
		che.setDeptName("B");
		hyd.setDeptLoct("hyderabad");
		che.setDeptLoct("Chennai");
		Employee mg1 = new Employee("Akash","1235",70000,hyd,null,"manager");
		Employee mg2 = new Employee("Samir","1294",70000,che,null,"manager");
		list.add(new Employee("Sai","1234",40000,hyd,mg1,"developer"));
		list.add(mg1);
		list.add(new Employee("Ashwin","1264",50000,hyd,mg1,"developer"));
		list.add(mg2);
		list.add(new Employee("Renu","1267",30000,che,mg2,"tester"));
		list.add(new Employee("John","1124",50000,che,mg2,"developer"));
		listEmp(list); //display all the employees
		listDept(list,"A");
		listRole(list,"developer");
		salInc(list,"developer",2.3);
		listMng(list,"Akash");
		
	}
	public static void listEmp(ArrayList<Employee> l) {
		System.out.println("The list are Employees: ");
		for(Employee e: l) {
			System.out.println(e);
		}
	}
	public static void listDept(ArrayList<Employee> l,String dptname) {
		System.out.println("The list of Employees in the department "+dptname+" are");
		for(Employee e: l) {
			if(e.dpt.getDeptName()==dptname) {
				System.out.println(e.getName());
			}
		}
	}
	public static void listRole(ArrayList<Employee> l,String role) {
		System.out.println("The list of Employees in the Role "+role+" are");
		for(Employee e: l) {
			if(e.role.getRole()==role) {
				System.out.println(e.getName());
			}
		}
	}
	public static void salInc(ArrayList<Employee> l,String role,double inc) {
		System.out.println("Salaries incremented for the given role: "+role);
		System.out.println("Employees with Incremented salaries are: ");
		for(Employee e:l) {
			if(e.role.getRole()==role) {
				double a = inc*e.getSalary();
				a = a/100;
				double temp = e.getSalary() + a;
				e.setSalary(temp);
				System.out.println("Name: "+e.getName()+" Salary: "+e.getSalary());
			}
		}
	}
	public static void listMng(ArrayList<Employee> l,String mng) {
		System.out.println("Employees with Manager: "+mng);
		for(Employee e:l) {
			if(e.getMng()==mng){
				System.out.println(e.getName());
			}
		}
	}

}
