class DCNode{
	
	public int data;
	DCNode next;
	DCNode prev;
	
	DCNode(){
		data = 0;
		next = prev = null;
	}
	
	DCNode(int v){
		data = v;
		next = prev = null;
	}
}