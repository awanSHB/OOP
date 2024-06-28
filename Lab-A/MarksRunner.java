import java.util.*;
public class MarksRunner {
	public static void main(String args[]) {
		Scanner inp = new Scanner(System.in);
		Marks mr = new Marks();
		System.out.print("Enter the OOPS marks: ");
		int o = inp.nextInt();
		System.out.print("Enter the DSA marks: ");
		int d = inp.nextInt();
		System.out.print("Enter the PF marks: ");
		int p = inp.nextInt();
		System.out.println(mr.calculatesum(o, d, p));
	}
}
