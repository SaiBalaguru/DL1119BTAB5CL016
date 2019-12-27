package sortPackage;
import java.util.Arrays;
import java.util.Comparator;

import compare.employee;

public class Sorter implements Comparator<employee> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String[] str = {"A","C","E","B","D"};
		Arrays.sort(args);
		for(String s: args) {
			System.out.println(s);
		}
		employee[] e = new employee[3];
		 e[0] = new employee("Sai",1234);
		 e[1] = new employee("Bai",1200);
		 e[2] = new employee("Cai",1112);
		 Arrays.sort(e);
		 for(employee s: e) {
			System.out.println(s);
		}
		 System.out.println("Using Comparator");
		Arrays.sort(e,e[2]);
		for(employee s: e) {
			System.out.println(s);
		}
		System.out.println("Compare by Ids innerclass: ");
		Arrays.sort(e,new Comparator<employee>(){
			@Override
			public int compare(employee e1, employee e2) {
				// TODO Auto-generated method stub
				return e1.getId() - e2.getId();
			}
		});
		for(employee s: e) {
			System.out.println(s);
		}
		System.out.println("Sort by their Salary");
		e[0].setSalary(53000);
		e[1].setSalary(30000);
		e[2].setSalary(43000);
		Arrays.parallelSort(e,new Comparator<employee>() {
			@Override
			public int compare(employee e1, employee e2) {
				return (int)(e1.getSalary() - e2.getSalary());
			}
		});
		for(employee s: e) {
			System.out.println(s);
		}
		
		
	}

	@Override
	public int compare(employee o1, employee o2) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}


