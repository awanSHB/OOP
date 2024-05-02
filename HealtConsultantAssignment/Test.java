class Test{
	public static void main(String args[]){
		System.out.println("\n\n\t\t\t\t|---------------------------------|");
		System.out.println("\t\t\t\t|                                 |");
		System.out.println("\t\t\t\t|  OlaDoc : Health Consultant     |");
		System.out.println("\t\t\t\t|                                 |");
		System.out.println("\t\t\t\t|---------------------------------|\n\n\n");
		// System.out.println("\t\t\tProvinces are :- \n\t\t\t1:- Punjab\n\t\t\t2:- Sindh\n\t\t\t3:- KPK\n\t\t\t4:- Balochistan\n\n");
		Hospital hp = new Hospital("Pubjab", "Rawalpindi", "R.A Bazar", "AFIRM");
		hp.display();
		
		Patient pa = new Patient("Ahmed", 341022, "0326-8020111", "abc@gmail.com", 27, "Male", "street abc/ralwapindi");
		pa.display();
		
		Receptionist rt = new Receptionist(pa);
		rt.display();
		
		
	}
}