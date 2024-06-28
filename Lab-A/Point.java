
public class Point {
	private int x;
	private int y;
	public Point() {
		x = 1;
		y = 2;
	}
	public Point(int a, int b) {
		x = a;
		y = b;
	}
	public void setX(int a) {
		x = a;
	}
	public void setY(int b) {
		y = b;
	}
	public void display() {
		System.out.println("The X point is : "+x+" and Y point is :"+y);
	}
	public void movepoint(int a, int b) {
		x = x+a;
		y = y+b;
		System.out.println("X coordinate after moving : "+x+" Y coordinate after moving "+y);
	}
}
