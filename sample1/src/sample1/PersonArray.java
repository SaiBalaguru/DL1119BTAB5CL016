package sample1;

public class PersonArray {
	private Person[] persons;
	private int pers = 5;
	private int counter = 0;
	public PersonArray() {
		persons = new Person[pers];
	}
	public void addPerson(Person p) {
		persons[counter++] = p;
	}
	public void displayPerson() {
		for(Person p: persons) {
			System.out.println(p);
		}
	}

	public static void main(String[] args) {
		PersonArray  p = new PersonArray();
		Person amit = new Person("Amit",123455L);
		Person amiy = new Person("Amit",123455L);
		Person amic = new Person("Amit",123455L);
		Person amix = new Person("Amit",123455L);
		Person amir = new Person("Amit",123455L);
		p.addPerson(amit);
		p.addPerson(amiy);
		p.addPerson(amic);
		p.addPerson(amix);
		p.addPerson(amir);
		p.displayPerson();
	}

}
