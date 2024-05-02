public class Validity extends Pin {

    String cd = "1234";

    Validity(String c) {
        super(c);
    }

    boolean isvalid() {
        if (code.equals(cd)) {
            return true;
        } else {
            System.out.println("Your Code is not valid!!!");
            return false;
        }
    }

    void displayVl() {
        if (isvalid()) {
            super.displayP();
            System.out.println("Your Code is Valid!!!");
        }
    }

}
