package sample1;

public class Person {
	private String name;
	private long mobileNumber;
	private static int  instances = 0;
	public Person()
	{
		instances++;
	} 
	//Overloaded Constructor
	public Person(String name, long num) {
		this();
		this.name = name;
		mobileNumber = num;
	}
	public Person(String name) {
		this(name,0L);
	}
	//getter or Setter
	public void setName(String name) {
		this.name = name;
	}
	public void setMobileNumber(long num) {
		mobileNumber = num;
	}
	public String getName() {
		return name;
	}
	public long getmobileNumber() {
		return mobileNumber;
	}
	public int getInstances() {
		return instances;
	}
	@Override  //annotation
	public String toString() {    // overriding the toString method
		return name+";"+mobileNumber;
	}
	public static void main(String[] args) {
		Person sai = new Person();
		sai.setName("Sai");
		sai.setMobileNumber(123456789346678889L);
		System.out.println("The name of the person is: " + sai.getName());
		System.out.println("The number of the person is: " + sai.getmobileNumber());
		System.out.println(sai);
		Person harsha  = new Person();
		harsha.setName("Sanjay Manjraekar");
		harsha.setMobileNumber(3456789746L);
		System.out.println("The details: "+ harsha.getName()+" ; " +harsha.getmobileNumber());
		System.out.println(harsha.toString());
		Person ar = new Person("Akbar",2345678L);
		System.out.println(ar.toString());
		Person ar1 = new Person("John");
		System.out.println("The name is: " + ar1.name);
		System.out.println("The number of instances: " + instances);
		Person[] parray = {sai,harsha,ar,ar1};
		System.out.println(parray[0]);

	}

}
