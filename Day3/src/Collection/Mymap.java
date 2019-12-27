package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Mymap {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<>();  //Hashmap is a bew version
		map.put(1, "Laptop");
		map.put(2,"Mobile");
		map.put(3, "Tablet");
		map.put(4,"Desktop");
		String device  = map.get(3);
		System.out.println(device);
		System.out.println("The map is: ");
		Set<Integer> set = map.keySet();
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(map.get(key));
		}
		Map<Integer,String> student = new HashMap<>();
		student.put(123, "Asha");
		student.put(345, "Venu");
		student.put(87, "samir");
		student.put(265, "sita");
		Set<Integer> key = student.keySet();
		System.out.println("The Name of the person is: ");
		findName(student,key,87);		
		List<Student> stds = new ArrayList<>();
		Student a = new Student("Akash",234);
		Student b = new Student("Prakash",134);
		Student c = new Student("Ashwin",834);
		Student d = new Student("Ravi",534);
		Map<Integer,String> student1 = new HashMap<>();
		stds.add(a);
		stds.add(b);
		stds.add(c);
		stds.add(d);
		Iterator<Student> itd = stds.iterator();
		while(itd.hasNext()) {
			Student s = itd.next();
			student1.put(s.getNum(),s.getName());
		}
		Set<Integer> key1 = student.keySet();
		System.out.println("The student name is: (Through STudent class):");
		findName(student1,key1,534);
	}
	public static void findName(Map<Integer,String> st,Set<Integer> key,int f) {
		Iterator<Integer> it = key.iterator();
		while(it.hasNext()) {
			Integer a = it.next();
			if(a==f) {
				System.out.println(st.get(a));
			}
			
		}
		
	}

}
