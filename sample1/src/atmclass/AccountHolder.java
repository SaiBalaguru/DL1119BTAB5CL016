package atmclass;

public class AccountHolder {
	 String name;
	int actPin;
	long balance;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getActPin() {
		return actPin;
	}
	public void setActPin(int actPin) {
		this.actPin = actPin;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public AccountHolder(String name, int actPin, long balance) {
		this.name = name;
		this.actPin = actPin;
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "AccountHolder [Account Holder=" + name + ", account tPin=" + actPin + ", Account balance=" + balance + "]";
	}
	
}
