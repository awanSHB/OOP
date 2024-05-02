class ArrayOfObjects{
	public static void main(String args[]){
		
		Employee e[] = new Employee[3];
		e[0] = new Employee("Ali", 12000, "fao3092");
		e[1] = new Employee("Ahmed", 13000, "dfjiqu023i2");
		e[2] = new Employee("Qasim", 4000, "djeid48234");
		
		
		System.out.println("\t__________HEAP________\n");
		System.out.println("\t--------");
		System.out.println("\t|_e[2]_|");
		System.out.println("\t|_e[1]_|");
		System.out.println("\t|_e[0]_|\n\n");
		
		e[0].display();
		e[1].display();
		e[2].display();
	}
}

class Employee{
	public String name;
	public int salary;
	public String id;
	
	Employee(String name, int salary, String id){
		this.name = name;
		this.salary = salary;
		this.id = id;
	}
	
	void display(){
		System.out.println("\t----------------------");
		System.out.println("\t|Name is : "+name+"|\n\t|Salary is : "+salary+"|\n\t|Id is : "+id);
		System.out.println("\t----------------------");
	}
}