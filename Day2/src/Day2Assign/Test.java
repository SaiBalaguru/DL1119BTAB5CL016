package Day2Assign;

public class Test extends Organisation{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Organisation e1 = new Employee(1234,"CSE");
		Organisation dept = new Department("Hyderabad");
		Organisation p1 = new Person("Sai");
		p1.setAddress(12, "Street 5", "Hyderabad", 500123);
		p1.setId(e1.getId());
		p1.setDept(e1.getDept());
		//System.out.println(p1);
		Organisation[] p ;
		p = new Person[5];
		p[0] = new Person("Ram");
		p[1] = new Person("John");
		p[2] = new Person("Malik");
		p[3] = new Person("Sita");
		p[4] = new Person("Saif");
		p[0].setAddress(12, "gh cross", "Hyderabad", 500987);
		p[1].setAddress(24, "Ca street", "Hyderabad", 500980);
		p[2].setAddress(56, "KAS Street", "Bangalore", 765980);
		p[3].setAddress(68, "BAS Street", "Chennai", 965980);
		p[4].setAddress(34, "VAS Street", "Delhi", 865980);
		Organisation[] e;
		e = new Employee[5];
		e[0] = new Employee(4567,"HR");
		e[1] = new Employee(4568,"Dev");
		e[2] = new Employee(4569,"Dev");
		e[3] = new Employee(4569,"Dev");
		e[4] = new Employee(4569,null);
		for(int i=0;i<p.length;i++)
		{
			p[i].setId(e[i].getId());
			p[i].setDept(e[i].getDept());
		}
		for(int i=0;i<p.length;i++) {
			if(p[i].getDept()=="Dev")
			{
				//System.out.println(p[i]);
			}
			
		}
		Test.empNODept(p);

	}
	public static void empNODept(Organisation [] p) {
		for(Organisation a: p ) {
			if(a.getDept()==null)
			{
				System.out.println(a);
			}
			
		}
	}

}
