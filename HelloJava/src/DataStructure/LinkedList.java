package DataStructure;

public class LinkedList {
	Node head;
	private int listLength=0;
	
	/*
	 * Insert a node at the end of existing list. 
	 */
	
	public void append(int data) {
		Node node = new Node();
		node.data= data;
		node.next= null;
		
		if(head==null) {
			head = node;
		} else {
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		++listLength;
	}
	
	/*
	 * show all nodes data 
	 */	
	public void show() {
		Node node = head;
		while(node.next != null) {
			System.out.println(node.data);
			node = node.next;
		}
		System.out.println(node.data);
	}
	
	/*
	 * Insert data at a specific position in a list
	 */
	public void insertAtPosition(int data,int pos) {
		try
		{
			if((pos <1)||(pos>(listLength+1))) {
				throw new Exception();
			}
			else {
				Node node = new Node();
				node.data = data;
				if(pos == 1) {
					node.next = head;
					head = node;
					++listLength;
				}
				else if(pos == (listLength+1)) {					
					append(data);					
				}
				else {
					Node n = head;
					Node prev = null;
					while(pos > 1) {
						prev = n;
						n = n.next;
						--pos;
					}
					
					prev.next = node;
					node.next = n;
					++listLength;
				}				
			}
			
		}
		catch(Exception e)
		{
			System.err.println("Postional value " + pos + " out of range" + e);
		}		
		 
	}
	
	/*
	 * Show number of nodes in a list
	 */
	
	public int count() {
		return listLength;
	}
	
	public void deleteByPosition(int pos) {
		int startIndex = 1;
		try
		{
			if((pos <1)||(pos>listLength)) {
				throw new Exception();
			}
			else {
				Node n = head;
				Node prev = null;
				while(startIndex < pos) {
					prev= n;
					n = n.next;
					--pos;
				}
				if(prev==null) {
					head = n.next;
				}else {
					prev.next = n.next;
				}
				--listLength;
			}
		}
		catch(Exception e)
		{
			System.err.println("Postional value " + pos + " out of range" + e);
		}
			
	}

}
