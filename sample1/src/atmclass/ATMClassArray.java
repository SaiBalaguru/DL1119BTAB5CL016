package atmclass;

public class ATMClassArray {
	private long withdrawLmt = 40000L;
	private long total = 1000000L;
	public static final long minBal = 2000;
	private AccountHolder[] cust;
	private static final int numOfHolders = 3;
	private  int count = 0;
	
	public void addAccount(String name, int pin, long bal ) {
		
		if(count<numOfHolders)
		cust[count++]  = new AccountHolder(name,pin,bal);
	}
	public long withdraw(long sum,  int pin, String name) {
		for(AccountHolder c: cust ) {
			if(c.name == name) {
		if(validate(c.actPin, pin))
		{
			if((sum<withdrawLmt) && (c.balance-sum)>minBal) {
				total-=sum;
				c.balance-=sum;
				return sum;
			}
		}
		}
			else System.out.println("Invalid Account Name");
		}
		return 0;
	}
	public double deposit(long sum, String name, int pin)
	{
		for(AccountHolder c: cust ) {
			if(c.name == name) {
		if(validate(c.actPin, pin))
		{
				total+=sum;
				c.balance+=sum;
				return sum;
		}
			}
		}
		return 0;
	}
	public boolean validate(int actPin, int pin) {
		
		return (actPin==pin);
	}
	@Override
	public String toString() {
		return cust.toString();
	}
	public static void main(String[] args) {
//		ATMClass cust = new ATMClass();
//		cust.withdraw(60000);
//		cust.deposit(10000);
//		System.out.println(cust);		
		ATMClassArray cust1 = new ATMClassArray();
		ATMClassArray cust2 = new ATMClassArray();
		ATMClassArray cust3 = new ATMClassArray();
		cust1.addAccount("SAi", 1234, 20000);
		cust2.addAccount("Rai", 1235, 21000);
		cust3.addAccount("Bai", 1236, 22000);
		cust1.withdraw(3000, 1234,"SAB");
		cust2.withdraw(1000, 1235,"Rai");
		System.out.println(cust1);
		System.out.println(cust2);
		
		
	}


}
