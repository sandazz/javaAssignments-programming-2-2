import java.util.Scanner;
class Node{
Node next;
int data;

Node(int data){
	this.next = null;
	this.data = data;
}
}

class linkedNode{
	Node rear = null;
	Node front = null;
	boolean isEmpty(){
		return(front == null);	
	}

	void enQueue(int data){
		Node newNode = new Node(data);
		if(isEmpty()){
			rear = front = newNode;
		}else{
			rear.next = newNode;
			rear = newNode;
		}
		
	}

	void deQueue(){
		if(isEmpty()){
			System.out.println("Queue is already empty");
		}else if(front == null){
			front = null;
			rear = null;
		}else{
			System.out.println(front.data);
			front = front.next;
		}
	}

	void show(){
		if(isEmpty()){
			System.out.println("Queue is empty");
		}else{
			Node current = front;
			while(current!=null){
				System.out.print(current.data+" ");
				current = current.next;
			}
			System.out.println();
		}
	}

	void peek(){
		System.out.println(front.data);
	}

	void userInput(){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the value to input : ");
		int value = input.nextInt();
		enQueue(value);
	}
}

class main{
	public static void main(String args[]){
		linkedNode node1 = new linkedNode();
		node1.enQueue(1);
		node1.enQueue(2);
		node1.enQueue(3);
		node1.enQueue(4);
		node1.enQueue(5);
		
		node1.deQueue();
		
		node1.userInput();
		
		node1.peek();
		
		node1.deQueue();
		
		node1.show();
		
		for(int i=0; i<5; i++){
			node1.deQueue();
		}
		
		node1.userInput();
		node1.userInput();
		node1.show();
		
	}
}