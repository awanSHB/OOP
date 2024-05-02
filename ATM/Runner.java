import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the PINCODE : ");
        String c = inp.nextLine();
        System.out.print("\nEnter the name: ");
        String n = inp.nextLine();
        System.out.print("\nEnter Your Age: ");
        int a = inp.nextInt();
        System.out.print("\nEnter the amount You want to withdraw: ");
        int w = inp.nextInt();
        inp.close();

        Amount am = new Amount(c, n, a, w);
        am.displayA();
    }
}