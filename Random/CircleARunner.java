class CircleARunner{
	public static void main(String args[]){
		CircleA c1 = new CircleA(5.0);
		System.out.println("The radius is : "+c1.getRadius()+" The area is : "+c1.getArea());
		
		c1.setRadius(c1.getRadius() * 1.1);
		System.out.println("The radius is : "+c1.getRadius()+" The area is : "+c1.getArea());
		
		System.out.println("The number of Objects are : "+CircleA.getNoOfObjects());
	}
}