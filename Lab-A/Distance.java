
public class Distance {
	public int feet;
	public int inch;
	
	public Distance() {
		feet = 12;
		inch = 10;
	}
	public Distance(int f, int i) {
		feet = f;
		inch = i;
	}
	public void display() {
		System.out.println("The data members are : feet , inch");
		System.out.println("The distance is "+feet+"ft : "+inch+"inch");
	}
}
