class CircleTestWithStaticMembers{
	public static void main(String args[]){
		System.out.println("Before creating an object");
		System.out.println("The number of objects are : "+Circle.noOfObjects);
		
		Circle c1 = new Circle(5);
		System.out.println("\n\nAfter Creating an Object");
		System.out.println("The radius is : "+c1.radius+" The objects are : "+c1.noOfObjects);
		
		Circle c2 = new Circle(5);
		c2.radius = 10;
		
		System.out.println("\n\nAfter Creating new Object, and modifying radius");
		System.out.println("The radius is : "+c2.radius+" The objects are : "+Circle.noOfObjects);
		
	}
}