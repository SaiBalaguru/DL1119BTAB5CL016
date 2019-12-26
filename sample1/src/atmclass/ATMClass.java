package atmclass;

public class ATMClass {
	private long withdrawLmt = 40000L;
	private long total = 1000000L;
	public static final long minBal = 2000;
	private AccountHolder cust;
	private int numOfHolders = 3;
	private int count = 0;
	public ATMClass()
	{
		
		this.addAccount("sab", 1234, 20000);
	}
	public void addAccount(String name, int pin, long bal ) {
		
	 cust  = new AccountHolder(name,pin,bal);
	}
	public long withdraw(long sum,  int pin) {
		if(validate(pin))
		{
			if((sum<withdrawLmt) && (cust.balance-sum)>minBal) {
				total-=sum;
				cust.balance-=sum;
				return sum;
			}
		}
		return 0;
	}
	public double deposit(long sum)
	{
		if(validate(cust.actPin))
		{
				total+=sum;
				cust.balance+=sum;
				return sum;
		}
		return 0;
	}
	public boolean validate(int pin) {
		
		return (cust.actPin==pin);
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
		ATMClass cust1 = new ATMClass();
		cust1.withdraw(3000,1234);
		cust1.deposit(2500);
		System.out.println(cust1);
		System.out.println("ATM Details: " + cust1.total);
		
	}

}
