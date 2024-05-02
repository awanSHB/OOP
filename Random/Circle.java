class Circle{
	double radius;
	static int noOfObjects;
	
	Circle(){
		radius = 0;
		noOfObjects++;
	}
	
	Circle(double radius){
		this.radius  = radius;
		noOfObjects++;
	}
	
	Circle(Circle c){
		radius = c.radius;
	}
	
	public Circle change(Circle c){
		Circle cn = new Circle(c.radius);
		return cn;
	}
	
	
	public void setRadius(double r){
		radius = r;
	}
	
	public double getRadius(){
		return radius;
	}
	
	
	static int getNumberOfObjects(){
		return noOfObjects;
	}
	
	double getArea(){
		return radius * radius * Math.PI;
	}
}