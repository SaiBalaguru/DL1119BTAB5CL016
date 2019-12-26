package test2;

public class Course {
	private int counter = 0;
	private String subj1;
	private String subj2;
	private Student[] stds;
	private Course[] courses;
	private int limit =3;
	private int num = 0;
	public Course() {
		stds = new Student[limit];
	}
	public void setSubj1(String a) {
		subj1 = a;
	}
	public void setSubj2(String a) {
		subj2 = a;
	}
	public String getSubj1() {
		return subj1;
	}
	public String getSubj2() {
		return subj2;
	}
	public void addCourses(Course c) {
		if(num<limit)
		{
			courses[num++] = c;
		}
		else {
			System.out.println("Courses limit reached");
		}
	}
	
	public void addStudent(Student s) {
		if(counter<limit) {
			stds[counter++] = s;
		}
		else {
			System.out.println("The student's limit is reached");
		}
	}
		public void display() {
			for(Student s: stds) {
				System.out.println(s);
			}
		}
		public void printStudentNames(String subject) {
			for(Course c: courses) {
				if(c.getSubj1().equalsIgnoreCase(subject)||c.getSubj2().equalsIgnoreCase(subject)) {
					Student[] students = c.getStudentArray() 
				}
			}
		}
	public static void main(String[] args) {
		Course phys = new Course();
		phys.setSubj1("ahdgjd");
		phys.setSubj2("sdhbuisd");
		phys.addStudent(new Student("assdsd","sdsydyt"));
		phys.addStudent(new Student("adsfdg","sfgsdfgdsf"));
		phys.addStudent(new Student("adsfghfhd","sdgdfhghdyt"));
		phys.display();
		
	}

}
