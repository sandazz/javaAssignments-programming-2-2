import java.util.Scanner;
class Queue{
String Queue[] = new String[5];
int size;
int front;
int rear;

Queue(){
	this.front = 0;
	this.rear = -1;
	this.size = 5;
}

void isEmpty(){
	if( rear == -1){
		System.out.println("Queue is empty");
	}else{
		System.out.println("Queue is not empty");
	}
	
}

void isFull(){
	if(rear == size-1){
		System.out.println("Queue is full");
	}else{
		System.out.println("Queue is not full");
	}
}

void enQueue(String data){
	if(rear == size-1){
		System.out.println("Queue is overFlow");
	}else{
		rear++;
		Queue[rear] = data;
	}
	
}

void deQueue(){
	if(front>rear){
		front = 0;
		rear = -1;
		System.out.println("queue is underFlow");
	}else{
		String data = Queue[front];
		front++;
	}
}

void show(){
	System.out.print("elements :");
	for(int i=0; i<size-1; i++){
		System.out.print(Queue[front+i]+" ");
	}
	System.out.println();
}

void peek(){
	System.out.println(Queue[front]);
}

void userInput(){
	Scanner input = new Scanner(System.in);
	System.out.print("Enter the value to input : ");
	String value = input.next();
	enQueue(value);
}
}

class main{
	public static void main(String args[]){
		Queue Q1 = new Queue();
		Q1.enQueue("e1");
		Q1.enQueue("e2");
		Q1.enQueue("e3");
		Q1.enQueue("e4");
		Q1.enQueue("e5");
		
		Q1.deQueue();
		
		Q1.userInput();
		
		Q1.peek();
		
		Q1.deQueue();
		
		Q1.show();
		
		for(int i=0; i<5; i++){
			Q1.deQueue();
		}
		
		Q1.userInput();
		Q1.userInput();
		Q1.show();
		
	}
}