package inherit;

public abstract class  Account implements Printer {
    protected String name;
	protected int num;
	protected double balance;
	public Account(String name, int num, double balance) {
		super();
		this.name = name;
		this.num = num;
		this.balance = balance;
		System.out.println("This is SUper class constructor");
	}
	@Override
	public String toString() {
		return "Account [name=" + name + ", num=" + num + ", balance=" + balance + " Account-type= " + this.getClass().getName() + "]";
	}
	@Override
	public void print(String s){
		System.out.println("Printing Account info: " + s);
	}
	public void withdraw(double sum) {
		//balance-=sum;   //Abstract method has no implementation
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	

}
