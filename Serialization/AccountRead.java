import java.io.*;

class AccountRead{
	public static void main(String args[]){
		Account ac1 = new Account(1, 1000, "A");
		Account ac2 = new Account(2, 2000, "B");
		Account ac3 = new Account(3, 1500, "C");
		
		ac1.withdraw(500);
		ac1.display();
		
		ac2.deposit(100);
		ac2.display();
		
		Account.transfer(ac2, ac1, 500);
		
		ac2.display();
		ac1.display();
		
		Account.transfer(ac2, ac3, 1000);
		ac2.display();
		ac3.display();
	}
}