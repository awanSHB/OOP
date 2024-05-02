class Patient{
	protected String name;
	protected int id;
	protected String phone;
	protected String email;
	protected int age;
	protected String gender;
	protected String address;
	
	Patient(String n, int i, String p, String e, int a, String g, String ad){
		name = n;
		id = i;
		phone = p;
		email = e;
		age = a;
		gender = g;
		address = ad;
	}
	
	void display(){
		System.out.println("\n\nYour detail is :-->\nYour name  : "+name+"\nYour id    : "+id+
		"\nYour Phone : "+phone+"\nYour Email : "+email+"\nYour Age   : "+age+"\nYour Gender: "
		+gender+"\nYour Address : "+address);
	}
}