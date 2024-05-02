import java.util.*;

public class Person extends Validity {
    protected String name;
    protected int age;
    public Date d;
    GregorianCalendar cal = new GregorianCalendar();
    int day = cal.get(GregorianCalendar.DAY_OF_MONTH);
    int month = cal.get(GregorianCalendar.MONTH);
    int year = cal.get(GregorianCalendar.YEAR);

    Person(String c, String n, int a) {
        super(c);
        name = n;
        age = a;
        d = new Date(day, month, year);
    }

    void displayPr() {
        if (isvalid()) {
            super.displayVl();
            System.out.println("\n\nYour name is : " + name + "\nAge is : " + age);
            d.display();
        }
    }
}
