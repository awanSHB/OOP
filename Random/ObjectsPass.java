class ObjectsPass{
	
	//Here we are only changing object's references, 
	//we are passing the references of one object into another
	public static void swap1(Circle x, Circle y){
		Circle t = x;
		x = y;
		y = t;
	}
	
	//Here we are changing the radius values
	public static void swap2(Circle x, Circle y){
		double t = x.radius;
		x.radius = y.radius;
		y.radius = t;
	}
	
	
	//Here values are passed, so we are only playing with value not indexes
	public static void swap3(int n1, int n2){
		int t = n1;
		n1 = n2;
		n2 = t;
		System.out.println("Inside swap3, n1 = a[0] :- "+n1+", n2 = a[1] :- "+n2);
	}
	
	
	//Here we are playing with indexes, so values are also changed
	public static void swap4(int[] a){
		int t = a[0];
		a[0] = a[1];
		a[1] = t;
		System.out.println("Inside swap4, n1 = a[0] :- "+a[0]+", n2 = a[1] :- "+a[1]);
	}
	
	public static void main(String[] args){
		Circle a1 = new Circle();
		Circle a2 = new Circle(20);
		
		Circle c1 = new Circle(1);
		Circle c2 = new Circle(2);
		swap1(c1, c2);
		System.out.println("After Swap1 Circle 1 = "+c1.radius+", Circle 2 = "+c2.radius);
		swap2(c1, c2);
		System.out.println("After Swap2 Circle 1 = "+c1.radius+", Circle 2 = "+c2.radius);
		System.out.println();
		
		
		
		
		a1.radius = 10;
		System.out.print("radius of a1 - a2  : ");
		System.out.println(a1.getRadius()+" - "+a2.getRadius());
		a2.radius = 13;
		System.out.print("After modifying a2 : ");
		System.out.println(a1.radius+" - "+a2.radius);
		Circle a3 = new Circle(a1);		//original value will not affected
		a1.radius = 11;
		// a3 = a3.change(a1);
		System.out.println("Object1 :-    "+a1.radius+", Object2 :- "+a2.radius+", object3 :- "+a3.radius);
		System.out.println();
		
		
		
		
		
		int[] a = {1, 2};
		swap3(a[0], a[1]);
		System.out.println("After swap3 :-   a[0] = "+a[0]+", a[1] :- "+a[1]);
		System.out.println();
		
		swap4(a);
		System.out.println("After swap4 :-   a[0] = "+a[0]+", a[1] :- "+a[1]);
	}
}