class ImmutableClasses{
	public static void main(String[] args){
		Student s = new Student("Ali", 12);
		System.out.println(s.getName());
		System.out.println(s.getAge());
		Student a = new Student("Q", 13);
		System.out.println(a.getName());
		System.out.println(a.getAge());
	}
}


//Child class cannot be created because of final keyword
//It restricts extension
final class Student{
	
	//Here we cannot change the value of variable because of final keyword
	//We cannot modify it outside the class because they are private
	private String name;
	private final int age;
	
	Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String getName(){ return name; }
	public int getAge(){ return age; }
}