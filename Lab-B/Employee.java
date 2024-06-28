class Employee extends Person{
	protected String office;
	protected int salary;
	
	Employee(String n, String a, String o, int s){
		super(n, a);
		office = o;
		salary = s;
	}
	
	void display(){
		super.display();
		System.out.println("\n\n\nThe Employee's Data is ===> \n\n\nThe name is : "+name+
		"\nThe address is : "+address+"\nThe office is : "+office+"\nThe salary is : "+salary);
	}
}