public class Amount extends Person {
    protected int amount;
    protected int withdraw;
    protected int remaining;

    Amount(String c, String n, int a, int w) {
        super(c, n, a);
        amount = 50000;
        withdraw = w;
        remaining = amount - withdraw;
    }

    boolean check_Amount() {
        if (withdraw < amount) {
            return true;
        } else {
            return false;
        }
    }

    void displayA() {
        if (isvalid()) {
            if (check_Amount()) {
                super.displayPr();
                System.out.println("\n\nYour Total Amount is : " + amount + "\nYour withdraw Amount is : " +
                        withdraw + "\nThe remaining amount is : " + remaining);
            } else {
                System.out.println("\nYou cannot withdraw cash as Your amount is Less!!!");
            }
        }
    }
}
