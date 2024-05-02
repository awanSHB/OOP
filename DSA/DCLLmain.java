class DCLLmain{
	public static void main(String args[]){
		DoubleCircularLL dc = new DoubleCircularLL();
		
		dc.start(50);
		dc.start(60);
		dc.start(70);
		dc.start(80);
		dc.display();
		
		dc.end(10);
		dc.end(20);
		dc.end(30);
		dc.end(40);
		dc.display();
		
		dc.remove(80);
		dc.display();
		
		dc.remove(40);
		dc.display();
	}
}