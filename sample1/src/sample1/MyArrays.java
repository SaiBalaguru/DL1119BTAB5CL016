package sample1;
import java.util.Arrays;
public class MyArrays {

	public static void main(String[] args) {
		//short form array declaration, memory allocation, initialization
		int[] nums =  {23,34,56,78,45,37}; // declaration, memory allocation, initialization
		for(int i = 0;i<nums.length;i++) {
			System.out.println(nums[i]*nums[i]);
		}
			double[] amounts;
			amounts = new double[5];
			amounts[0] = 24;
			amounts[1] = 46;
			amounts[2] = 567.789;
			amounts[3] = 457.5768;
			amounts[4] = 67;
			System.out.println("The value at 4 is: " + amounts[4]); 
			String[] abc = new String[3];
			abc[0] = "Hello";
			abc[1] = "bye";
			abc[2] = "good";
			System.out.println("The value at 1 is: " + abc[1]); //null will be output
			stringLength(abc); // by passing command line arguments
			valueChange(abc);
			stringLength(abc); // value changes due to pass by copy
			sortArray(nums);
	}
	public static void stringLength(String[] str) {
		for (int i = 0; i<str.length;i++) {
			System.out.print("The value is: " + str[i]);
			System.out.print(" ; The Length is: " + str[i].length() + "\n");
		}
	}
	public static void valueChange(String[] str) {
		str[0] = "123";
		str[1] = "345";
		str[2] = "1234";
		
	}
	public static void sortArray(int[] arr) {
		 Arrays.sort(arr);
		 System.out.print("The sorted list is: ");
		 for(int i=0; i<arr.length;i++)
			 System.out.print( arr[i] + " ");
	}

}
