
public class Account {
	public int balance;
	
	public Account() {
		balance = 5000;
	}
	public Account(int b) {
		balance = b;
	}
	public int withdraw(int b, int w) {
		if (w > b){
			System.out.println("Your balance is less than "+w);
			return 0;
		}
		System.out.println("Your withdraw "+w+" out of "+b+", so the remaining balance is: ");
		return (b-w);
	}
}
