package test2;

public class Student {
	private String name;
	private String rollid;
	public  Student(String name, String rollid){
		this.name = name;
		this.rollid = rollid;	
	}
	public String toString() {
		return name+";"+rollid;
	}
}
