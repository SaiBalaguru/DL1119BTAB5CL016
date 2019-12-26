package Day2Assign;

public class Person extends Organisation {
	Person(){}
	public Person(String Name) {
		setName(Name);
	}
	@Override
	public String toString() {
		return ("Nmae: " + this.getName() + " Department: "+ this.getDept() + " ID: "+ this.getId() + " Address: " +this.getAddress());
	}

}
