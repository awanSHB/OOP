import java.util.*;
public class AccountRunner {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter you balance : ");
		int bal = inp.nextInt();
		System.out.print("Enter the amount You want to withdraw: ");
		int amount = inp.nextInt();
		Account ac = new Account();
		System.out.println(ac.withdraw(bal, amount));
	}
}
