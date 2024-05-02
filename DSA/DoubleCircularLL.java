class DoubleCircularLL{
	
	private DCNode head;
	private DCNode tail;
	
	DoubleCircularLL(){
		head = tail = null;
	}
	
	public void display(){
		DCNode l = head;
		// DCNode a = head;
		System.out.println("");
		do{
			System.out.print("["+l.data+"] <==> ");
			l = l.next;
		}while(l!=head);
		System.out.println("\b\b\b=====> "+head.data+"\n");
	}
	
	public void start(int v){
		DCNode n = new DCNode(v);
		if(head==null){
			// n.next = head;
			head = tail = n;
			head.prev = tail;
			tail.next = head;
		}
		else if(head==tail){
			head.prev = n;
			head = n;
			head.next = tail;
			head.prev = tail;
			tail.next = head;
		}
		else{
			n.next = head;
			head.prev = n;
			head = n;
			head.prev = tail;
			tail.next = head;
		}
	}
	
	public void end(int v){
		DCNode n = new DCNode(v);
		if(head==null){
			head = tail = n;
			head.prev = tail;
			tail.next = head;
		}
		else if(head==tail){
			head.next = n;
			tail = n;
			tail.prev = head;
			head.prev = tail;
			tail.next = head;
		}
		else{
			tail.next = n;
			n.prev = tail;
			tail = n;
			head.prev = tail;
			tail.next = head;
		}
	}
	
	public void remove(int v){
		if(head.data==v){
			head = head.next;
			head.prev = tail;
			tail.next = head;
		}
		else if(tail.data==v){
			tail = tail.prev;
			head.prev = tail;
			tail.next = head;
		}
		else{
			DCNode a = head;
			DCNode b = head;
			while(a.data!=v){
				b = a;
				a = a.next;
			}
			a.next.prev = a.prev;
			b.next = a.next;
		}
	}
	
}