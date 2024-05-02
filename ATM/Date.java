// import java.util.*;

public class Date {
    public int day;
    public int month;
    public int year;

    Date(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    void display() {
        System.out.println("Date : " + day + "/" + month + "/" + year);
    }
}
