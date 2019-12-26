package inherit;

public class Accounttest {
	public static void showBalance(Account ac) {
		System.out.println(ac.getBalance());
	}
	public static void printAccount(Account ac, Printer p) {
		ac.print("from Account");
		p.print("This is inherited fro interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Savings acc = new Savings("Sai",1234,40000L);
		System.out.println(acc);
		Current acc1 = new Current("John",3456,50000L);
		System.out.println(acc1);
		acc1.withdraw(6000);
		Account acc2 = new Savings("Bob",3412,30000L); //Polymorphism
		acc2.withdraw(1000);
		System.out.println(acc2);
		showBalance(acc2);
		showBalance(acc1); // sending a subclass object
		Savings acc3 = new Savings("Sita",6789,70000L);
		acc3.print("From the test case");
		printAccount(acc1, new ConsolePrinter());
	}

}
