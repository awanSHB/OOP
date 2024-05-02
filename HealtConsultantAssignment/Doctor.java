class Doctor{
	protected String name;
	protected String email;
	protected String speciality;
	protected String p_no;
	
	Doctor(){
		name = "Qasim";
		email = "qasim@gmail.com";
		speciality = "Eye Specialist";
		p_no = "0321-949028000";
	}
	
	void display(){
		System.out.println("\n\nYour appointed doctor is ===>\nName       : "+name+"\nEmail      : "+
		email+"\nSpeciality : "+speciality+"\nPhone_no   : "+p_no);
	}
}