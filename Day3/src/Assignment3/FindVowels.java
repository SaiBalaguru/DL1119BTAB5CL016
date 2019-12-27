package Assignment3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class FindVowels {
	public static int size;
	public static List<String> list = new ArrayList<>();
	public static ArrayList<Integer> vow = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the size of the list: ");
		  size = setSize();
		  setString();
		  findVowels();
		  System.out.println("Entered words are: ");
//		  for(String s: list) {
//			  System.out.println(s);
//			  }
		Map<String,Integer> words = new HashMap<>();
		  for(int i=0;i<size;i++)
		  {
			  words.put(list.get(i), vow.get(i));
		  }
		  //System.out.println(words);
		  System.out.println("Enter the word to find vowels: ");
		  String check = new Scanner(System.in).nextLine();
		  Set<String> key = words.keySet();
		  Iterator<String> it = key.iterator();
		  if(words.containsKey(check)) {
		  while(it.hasNext()) {
			  String temp = it.next();
			  if(temp.equalsIgnoreCase(check)) {
				  System.out.println("Number of vowels: "+words.get(temp));
			  }
			  //System.out.println(temp+ " "+ words.get(temp));
		  }
		}
		  else {
			  System.out.println("Invalid Key");
		  }
	}


	public static int setSize() {
		Scanner sc = new Scanner(System.in);
		return sc.nextInt();
	}
	public static void setString() {
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<size;i++) {
			System.out.println("Enter the Word: " + (i+1) + "\n");
			list.add(sc.nextLine());
		}
	}
	public static void findVowels() {
		int count = 0, i =0;
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String temp = it.next();
			for(int j=0;j<temp.length();j++) {
				if(temp.charAt(j)=='a' || temp.charAt(j)=='A' || temp.charAt(j)=='e' || temp.charAt(j)=='E' ||
						temp.charAt(j)=='i' || temp.charAt(j)=='I' || temp.charAt(j)=='o' || temp.charAt(j)=='O' ||
								temp.charAt(j)=='u' || temp.charAt(j)=='U') {
					count++;
				}
			}
			vow.add(count);
//			System.out.println(vow.get(i));
//			i++;
			count = 0;
			
			
		}
	}

}
