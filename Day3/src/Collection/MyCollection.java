package Collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.Collections;
import java.util.Comparator;

public class MyCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<>();
		v.add("Sai");
		v.add("Hyderabad");
		v.add("India");
		v.add("PC");
		System.out.println(v.size());
		for(String s: v) {
			System.out.println(s);
		}
		System.out.println("Normal for iteration");
		for(int i=0;i<v.size();i++) {
			System.out.println(v.get(i));
		}
		System.out.println("Loop using Enumeration interface");
		Enumeration<String> e = v.elements();  //Enumeration has more elements
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		System.out.println("Loop using Iterator");
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		ArrayList<Integer> list  = new ArrayList<>(); //Not thread safe
		list.add(12); // boxing & unboxing
		list.add(53);
		list.add(43);
		list.add(23);
		
		Iterator<Integer> iter = list.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		int sum = 0;
		for(int i=0; i< list.size();i++) {
			sum =  sum + list.get(i);
		}
		System.out.println("The sum is: "+ sum);
		Collections.sort(list);
		System.out.println("Sorted List");
		System.out.println(list);
		
		List<Student> students = new ArrayList<>(); //List is an interface and Arraylist implements it
		students.add(new Student("asha",323));
		students.add(new Student("nina",21));
		students.add(new Student("samir",267));
		students.add(new Student("venu",1760));
		students.add(new Student("akash",760));
		Iterator<Student> sdit = students.iterator();
		while(sdit.hasNext()) {
			Student st = sdit.next();
			System.out.println(st.getName());
		}
		System.out.println("Sort the List using name = ");
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName()); 
			}
		});
		sdit = students.iterator();
		while(sdit.hasNext()) {
			Student st = sdit.next();
			System.out.println(st.getName());
		}
System.out.println("Sort the List using number = ");
		
		Collections.sort(students, new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getNum() - s2.getNum(); 
			}
		});
		sdit = students.iterator();
		while(sdit.hasNext()) {
			Student st = sdit.next();
			System.out.println(st);
		}
		System.out.println("Sort by name using seperate class: ");
		Collections.sort(students,new StudentNameSorter());
		sdit = students.iterator();
		while(sdit.hasNext()) {
			Student st = sdit.next();
			System.out.println(st);
		}
		System.out.println("Print names starting with 'a' ");
		filterByLetter(students);
		checkStudent(students,"venu");
		Hashtable<String,String> table = new Hashtable<>();
		table.put("admin", "admin123");
		table.put("user", "user123");
		Enumeration<String> enums = table.keys();
		while(enums.hasMoreElements()) {
			String key = enums.nextElement();
			String val = table.get(key);
			System.out.println(val);
		}
	}
	public static void filterByLetter(List<Student> st) {
		for(Student s: st) {
			if(s.getName().startsWith("a")) {
				System.out.println(s.getName());
			}
		}	
	}
	public static void checkStudent(List<Student> st, String name) {
		for(Student s: st) {
			if(s.getName().equalsIgnoreCase(name)) {
				System.out.println("The ID of Student '" + s.getName()+"' is: "+s.getNum());
				return;
			}	
		}
		System.out.println("No student of the name: '" + name+"' doesn't Exist");

	}

}
