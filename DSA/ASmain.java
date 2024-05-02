class ASmain{
	public static void main(String args[]){
		LinkedListAS l = new LinkedListAS();
		l.insertStart(10);
		l.insertStart(20);
		l.insertStart(30);
		l.display();
		
		l.insertEnd(40);
		l.insertEnd(50);
		l.insertEnd(60);
		l.display();
	}
}