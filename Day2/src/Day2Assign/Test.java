package Day2Assign;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organisation e1 = new Employee(1234,"CSE");
		Organisation dept = new Department("Hyderabad");
		Organisation p1 = new Person("Sai");
		p1.setAddress(12, "Street 5", "Hyderabad", 500123);
		p1.setId(e1.getId());
		p1.setDept(e1.getDept());
		System.out.println(p1);

	}

}
