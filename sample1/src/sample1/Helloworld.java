package sample1;

public class Helloworld {

	public static void main(String[] args) {
		Helloworld ob = new Helloworld();
		String hello = "Hello! Java world";
		System.out.println("\t" + hello); //concatenation is +
		int len = hello.length();
		System.out.println(len);
		System.out.println("Is this true  - "+(len == 100)); //Boolean constants are true/false
		
		if(true)
		{
			System.out.println("Hi");
		}
		System.out.println("The answer is: " + ((len==17) ? "Correct" : "wrong")); //ternary operator
		int m = 54 , n= 21;
		System.out.println("Product  = " + (m*n));
		if(m>n) {
			System.out.println(m+n);
		}
		for(int i = 0;i<len;i++)
		{
			System.out.print(i + " ");
		}
		double count  = 2456.098765;
		System.out.println("\n Divide by 0 = " + (count/0)); // gives infinity only for double else it returns an exception
		int a = (int)12.234;
		int b = 213;
		float temp = b;
		System.out.println("Explicit: " + a);
		System.out.println("implicit: " + temp);
		int ab = (int)'A';
		System.out.println(ab);
		char ascii  = (int)0;
		for(; (int)ascii<255;ascii++)
		{
			System.out.print(ascii + " ");
			System.out.print((int)ascii + " \n");
		}
		ob.rangeSum(1,100);
		System.out.println("The Sum is: " + add(23,34));
		calculate(3,0,"4");
	}
	
	public  void rangeSum(int n, int m) { //Static is important since it's called inside the static main 
		int total = 0;
		if(m>n) {
			for(int temp = n; temp <=m;temp++) {
			total = total + temp;
			}
			System.out.println("the Sum is:  " + total);
		}
		else {
			rangeSum(m,n);  // recursion
		}
	}
	public static int add(int a, int b) {
		return (a+b);
	}
	
	public static void calculate (double a, double b, String op) {
		double cal = 0;
		switch(op)
		{
		case "+": cal = a+b;
		System.out.println("The solution is: " + cal);
		break;
		case "-": cal = a-b;
		System.out.println("The solution is: " + cal);
		break;
		case "x": cal = a * b;
		System.out.println("The solution is: " + cal);
		break;
		case "/": 
			if(b!=0) {
				cal = a/b;
				System.out.println("The solution is: " + cal);
			}
			else
			{
				System.out.println("Invalid operands");
			}
			break;
			default:
				System.out.println("Invalid Operation");
		}
	}
}
