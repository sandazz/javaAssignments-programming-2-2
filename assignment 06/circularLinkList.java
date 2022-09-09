class Node{
	int data ;
	Node next;
	
	Node(int data){
		this.data = data ;
		this.next = null;
	}
}

class circularLinkList{
	Node head = null;
	Node tail = null;
	
	void addNode(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			tail.next = head;
		}else{
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	void show(){
		Node current = head;
		if(head == null){
			System.out.println("List is empty");
		}else{
			while(current.next != head ){
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.print(current.data+" ");
			System.out.println();
		}
	}
	
	void insertEmpty(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	void insertEnd(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			tail.next = head;
		}else{
			tail.next = newNode;
			tail = newNode;
			tail.next = head;
		}
	}
	
	void insertPoss(int data, int poss){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			tail.next = head;
		}else{
			Node current = head;
			for(int i=0; i<poss-1; i++){
				current = current.next;
			}
			newNode.next = current.next ;
			current.next = newNode;
		}
	}
	
	void insertBegin(int data){
		Node newNode = new Node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
			tail.next = head;
		}else{
			newNode.next = head;
			head = newNode;
			tail.next = head;
		}
	}
	
	void deleteEmpty(){
		if(head == null){
			System.out.println("list is already empty");
		}
	}
	
	void deleteBegin(){
		if(head == null ){
			System.out.println("list is already empty");
		}else{
			head= head.next;
			tail.next = head;
		}
	}
	
	void deleteEnd(){
		if(head == null){
			System.out.println("list is already empty");
		}else{
			Node current = head;
			Node prev = head;
			while(current.next != head){
				prev = current;
				current = current.next;
			}
			tail = prev;
			tail.next = head;
		}
	}
	
	void deletePoss(int poss){
		if(head == null){
			System.out.println("list is already empty");
		}else{
			Node current = head;
			Node prev = head;
			for(int i = 1; i<poss ; i++){
				prev = current;
				current = current.next;
			}
			prev.next = current.next;
		}
	}
	
	void search(int val){
		if(head == null){
			System.out.println("list is already empty");
		}else{
			Node current = head;
			int index = 1;
			boolean avail = false;
			while(current.next != head){
				current = current.next;
				index++;
				if(current.data == val){
					avail = true;
					break;
				}
			}
			if(current.data == val){
				avail = true;
			}
			
			if(avail){
				System.out.println(val+" is available in the " + index+" position");
			}else{
				System.out.println(val+" is not available in the list");
			}
		}
	}
}

class main{
	public static void main(String args[]){
		circularLinkList node = new circularLinkList();
		node.addNode(5);
		node.addNode(1);
		node.addNode(3);
		node.addNode(8);
		node.addNode(2);
		
		node.show();
		
		node.insertBegin(4);
		node.show();
		
		node.insertPoss(4,4);
		node.show();
		
		node.insertEnd(4);
		node.show();
		
		node.deleteBegin();
		node.show();
		
		node.deletePoss(5);
		node.show();
		
		node.deleteEnd();
		node.show();
		
		node.search(4);
		node.search(9);
		
	}
}