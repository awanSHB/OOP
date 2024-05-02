class Receptionist extends Doctor{
	protected int bill;
	protected String date;
	protected int id;
	protected String name;
	protected int token_no;
	
	Receptionist(Patient pa){
		super();
		name = pa.name;
		id = pa.id;
		bill = 3000;
		date = "11/4/2022";
		token_no = 19;
	}
	
	void display(){
		super.display();
		System.out.println("\n\nHere Is Your Receipt ::-->>\nPatient  : "+name+
		"\nId is    : "+id+"\nDate is  : "+date+"\nToken no : "+token_no+"\nBill is  : "+bill+"Rs");
	}
}