class LinkedListAS{
	
	private Node head;
	LinkedListAS(){
		head = null;
	}
	
	public void display(){
		Node l = head;
		System.out.println("");
		while(l!=null){
			System.out.print("["+l.data+"] --> ");
			l = l.next;
		}
		System.out.println("NULL\n");
	}
	
	public void insertStart(int v){
		Node n = new Node(v);
		n.next = head;
		head = n;
	}
	
	public void insertEnd(int v){
		Node n = new Node(v);
		Node l = head;
		if(head==null){
			head = n;
			return;
		}
		while(l.next!=null)
			l = l.next;
		l.next = n;
	}
	
	// public void remove
}