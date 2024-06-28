public class ComplexTest {
    public static void main(String args[]){
        Complex a = new Complex(11, 2.3);
        Complex b = new Complex(9, 2.3);
        Complex c = new Complex();
        c = a.Add(b);
        c.show();
    }
}
