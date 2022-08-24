class node{
	int data;
	node next;
	
	public node(int data){
		this.data= data;
		this.next=null;
	}
}
class singlyLinkedList{
	public node head = null;
	public node tail = null;
	
	public void addNode(int data){
		//create new node 
		node newNode = new node(data);
		if (head==null){
			//if list is empty both head and tail will be same node
			head = newNode;
			tail = newNode;
		}
		else{
			//newNode will be added after tail such that tail's next will point to newNode
			tail.next = newNode;
			//newNode will be the new tail of the list
			tail = newNode; 
		}
	}
	public void display(){
		node current = head;
		if(head == null){
			//if the list is empty
			System.out.println("list is empty");
			return;
		}
		while(current != null){
			//print data in the list one by one
			System.out.print(current.data + " ");
			current = current.next;
		}
		System.out.println();
	}
	public void insertEmpty(int data){
		//add data when list empty
		node newNode = new node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
		}
	}
	public void insertEnd(int data){
		//insert data at the end to list
		node newNode = new node(data);
		if(head == null){
			head = newNode;
			tail = newNode;
		}
		else{
			tail.next = newNode ;
			tail = newNode;
		}
	}
	public void insertBegin(int data){
		//insert data at the begining of the list
		node newNode = new node(data);
		if(head == null){
			head = newNode;
			tail = newNode;			
		}
		else{
			newNode.next = head; //head node will be next to newNode
			head = newNode; // head will be the new node
		}
	}
	public void insertPoss(int data, int poss){
		// data will add to a given position in the list
		node newNode = new node(data);
		if(head==null){
			head = newNode;
			tail = newNode;
		}
		else{
			node current = head;
			for(int i=1; i<poss-1;i++){
				current = current.next;
			}
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	public void deleteEmpty(){
		//delete empty list
		if(head==null){
			System.out.println("the list is already empty");
		}
	}
	public void deleteBegin(){
		//delete the first element
		if(head==null){
			System.out.println("the list is already empty");
		}
		else{
			head.next = head;
		}
	}
	public void deleteEnd(){
		//delete the end element in list
		if(head==null){
			System.out.println("the list is already empty");
		}
		else{
			node current = head;
			node prev = head;
			while(current.next!=null){
				prev = current;
				current = current.next;
			}
			tail=prev;
			tail.next = null;
		}
	}
	public void deletePoss(int poss){
		//delete the element in the given position
		if(head==null){
			System.out.println("the list is already empty");
		}
		else{
			node prev = head;
			node current = head;
			for(int i=1; i<poss; i++){
				prev = current;
				current = current.next;
			}
			prev.next = current.next;
		}
	}
	public void search(int val){
		//search the given element is available in the list
		if(head==null){
			System.out.println("the list is already empty");
		}
		else{
			node current = head;
			int index = 1;
			boolean avail = false;
			while(current.next!=null){
				current= current.next;
				index++;
				if(current.data==val){
					avail = true;
					break;
				}
			}
			if(avail)
				System.out.println(val+" is available in the "+index+"position");
			else
				System.out.println(val+" is not available in the list");
		
		}
	}
}
class main{
	public static void main(String args[]){
		singlyLinkedList sList = new singlyLinkedList();
		
		//adding element to list
		sList.addNode(5);
		sList.addNode(1);
		sList.addNode(3);
		sList.addNode(8);
		sList.addNode(2);
		sList.display();
		
		sList.insertEnd(255);
		sList.display();
	
		sList.insertPoss(300,3);
		sList.display();
	
		sList.insertBegin(500);
		sList.display();
		
		sList.deleteEnd();
		sList.display();
		
		sList.deletePoss(4);
		sList.display();
		
		sList.search(1000);
		sList.search(5);
		sList.search(4);
		sList.search(9);
	}
}