package inherit;

public class Savings extends Account {

	private static final double MINBAL = 10000; 
	
	
	public Savings(String name, int num, double balance) {
		super(name, num, balance);
		System.out.println("Super Constructor has been called");
		
	}
	@Override 
	public void withdraw(double sum) {
		if((balance-sum)>=MINBAL) {
			balance-=sum;
			//super.withdraw(sum);
		}
	}
	@Override
	public void print(String s) {
		System.out.println("This is inside savings class");
	}

}
