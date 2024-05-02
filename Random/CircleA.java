class CircleA{
	private double radius;
	private static int noOfObjects;
	
	CircleA(){
		noOfObjects++;
	}
	
	CircleA(double radius){
		this.radius = radius;
		noOfObjects++;
	}
	
	public void setRadius(double newRadius){
		radius = (newRadius >= 0)? newRadius: 0;
	}
	
	public double getRadius(){
		return radius;
	}
	
	public static int getNoOfObjects(){
		return noOfObjects;
	}
	
	public double getArea(){
		return radius * radius * Math.PI;
	}
}