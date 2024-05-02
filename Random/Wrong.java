//WRONG
class Wrong{
	public static void main(String[] args){
		method1();					//Accessing instance method without instance(object)
	}
	
	public void method1(){			//Instance method
		method2();
	}
	public static void method2(){	//Static method
		System.out.println("The radius is : "+c.radius);
	}
	Circle c = new Circle();
}

//CORRECT

class Right{
	public static void main(String[] args){
		Right ac = new Right();			//Created an instance of class 
		ac.method1();					//To access instance method
	}
	
	public void method1(){
		method2();
	}
	
	public void method2(){				//We have made it non static
		System.out.println("The radius of the circle is : "+c.radius);
	}
	
	Circle c = new Circle(10);
}

//CORRECT

class ACheck{
	public static void main(String[] args){
		method1();
	}
	
	public static void method1(){		//We have made this method static
		method2();
	}
	public static void method2(){
		Circle c = new Circle(10);		//We have created an object inside static method
		System.out.println("The radius is : "+c.radius);
	}
}