
public class Circle {
	private int radius;
	private int circum;
	
	public Circle() {
		radius = 3;
	}
	public Circle(int r) {
		radius = r;
	}
	public void display() {
		System.out.println("The radius of circle is = "+radius);
	}
	public void circumference(int r) {
		circum = 2*(22/7)*r;
		System.out.println("The circumference of circle is : "+circum);
	}
	
}
