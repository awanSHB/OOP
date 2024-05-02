public class Temperature {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Temperature obj = new Temperature();
        System.out.println("Enter the value for the temperature: ");
        int value = inp.nextInt();
        System.out.println("What do you want to convert into? press 1 for Fahrenseit, 2 for celsius: ");
        int choice = in.nextInt();
        if (choice == 1) {
            System.out.println("The temperature in celsius is : " + obj.fahrenheittocelsius(value));
        } else if (choice == 2) {
            System.out.println("The temperature in fahrenheit is : " + obj.celsiustofahrenheit(value));
        } else {
            System.out.println("Pleas enter correct input");
        }
    }

}
