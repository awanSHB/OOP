class Hospital extends Area{
	protected String name;
	protected String h_email;
	protected int no_of_docs;
	protected String phone_no;
	protected int no_of_rooms;
	
	Hospital(String province, String city, String location, String name){
		super(province, city, location);
		this.name = name;
		this.h_email = "afirm718@gmail.com";
		this.no_of_docs = 200;
		this.phone_no = "0314-7687000";
		this.no_of_rooms = 600;
	}
	
	void display(){
		super.display();
		System.out.println("\n\nThe Hospital is :- "+name+"\nEmail is      : "+h_email+
		"\nNo of Doctors : "+no_of_docs+"\nPhone no is   : "+phone_no+
		"\nNo of rooms   : "+no_of_rooms);
	}
}