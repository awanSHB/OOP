class Person{
	String name;
	String father_name;
	String phone_no;
	
	Person(){
		name = "";
		father_name = "";
		phone_no = "";
	}
	Person(String name, String father_name, String phone_no){
		this.name = name;
		this.father_name = father_name;
		this.phone_no = phone_no;
	}
	
	void display(){
		System.out.println("\nName is        :-  "+name+"\nFather_name is :-  "+father_name+
		"\nPhone_no is    :-  "+phone_no);
	}
}