import java.io.*;

class Account implements Serializable{
	
	public int account_no;
	public int total_amount;
	public String name;
	
	Account(int an, int ta, String n){
		account_no = an;
		total_amount = ta;
		name = n;
	}
	
	int withdraw(int amount){
		total_amount = total_amount-amount;
		return total_amount;
	}
	
	int deposit(int amount){
		total_amount = total_amount+amount;
		return total_amount;
	}
	
	static void transfer(Account ac1, Account ac2, int am){
		System.out.println("\nYou are transfering "+am+" amount from account "+ac1.account_no+
		" to account "+ac2.account_no);
		ac1.withdraw(am);
		ac2.deposit(am);
	}
	
	void display(){
		System.out.println("The remaining balance of ["+name+"] with account_no ["+account_no+
		"] is :- "+total_amount);
	}
}