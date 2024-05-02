class Area extends Region{
	protected String city;
	protected String location;
	
	Area(String province, String city, String location){
		super(province);
		this.city = city;
		this.location = location;
	}
	
	void display(){
		super.display();
		System.out.println("\n\nCity is :- "+city+"\nLocation : "+location);
	}
}