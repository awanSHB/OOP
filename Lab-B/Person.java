class Person{
	protected String name;
	protected String address;
	
	Person(String n, String a){
		name = n;
		address = a;
	}
	
	void display(){
		System.out.println("\n\nThe Person's Data is ===>\n\n\nThe name is : "+
		name+"\nThe Address is : "+address);
	}
}