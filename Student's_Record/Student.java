class Student{
	
	protected String name;
	protected int marks;
	protected int age;
	protected String semester;
	protected String section;
	
	Student(String name, int marks, int age, String semester, String section){
		this.name = name;
		this.marks = marks;
		this.age = age;
		this.semester = semester;
		this.section = section;
	}
	
	void display(){
		System.out.println("\n\nStudent's Detail is ===> \nName   : "+name+"\nMarks  : "+
		marks+"\nAge   : "+age+"\nSemester : "+semester+"\nSection : "+section);
	}
	
	
	
}