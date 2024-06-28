class Student extends Employee{
	protected String subject;
	protected int marks;
	
	Student(String n, String a, String o, int s, String sub, int m){
		super(n, a, o, s);
		subject = sub;
		marks = m;
	}
	
	void display(){
		super.display();
		System.out.println("\n\n\nThe Student's Data is ===> \n\n\nThe name is : "+name+
		"\nThe address is : "+address+"\nThe subject is : "+subject+"\nThe marks are : "+marks);
	}
}