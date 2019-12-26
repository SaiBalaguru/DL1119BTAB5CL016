package inherit;

public class Current extends Account {

	public Current(String name, int num, double balance) {
		super(name, num, balance);
		// TODO Auto-generated constructor stub
	}
	@Override 
	public void withdraw(double sum) {
//			if(sum < balance) {
//			balance-=sum;	
//			}
		super.withdraw(sum);
	}
	

}
