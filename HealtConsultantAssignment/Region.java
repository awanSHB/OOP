class Region{
	public String country;
	protected String province;
	
	Region(String province){
		this.province = province;
		this.country = "Pakistan";
	}
	
	void display(){
		System.out.println("\nCountry Name :-  "+country+"\nProvince : "+province);
	}
}