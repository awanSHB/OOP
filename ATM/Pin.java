public class Pin {
    protected String code;

    Pin(String c) {
        code = c;
    }

    void displayP() {
        System.out.println("\n\nYour Pincode is : " + code);
    }

}