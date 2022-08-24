class StackLinkList{
	class Node{ 
	 String data;
	 Node next;
	}

	Node top;
	
	public boolean isEmpty(){
		return (top==null);
	}
	
	public void push( String element){
		Node newNode=new Node();
		if(isEmpty()){
			newNode.data=element;
			newNode.next=top;
			top=newNode;
		}
		else{
			newNode.data=element;
			newNode.next=top;
			top=newNode;
		}
	}	
	
	public void pop(){
		if(isEmpty()){
			System.out.println("Stack UnderFlow");
		}
		else{
			top=top.next;
		}
	}
	
	public String peek(){
		if (!isEmpty()) {
            return top.data;
        }
        else { 
			System.out.println("Stack is empty");
			return "";
        }
	}
	public void print(){
		if (isEmpty()){
            System.out.printf("\nStack Underflow");
        }
        else {
            Node temp = top;
            while (temp != null) {
                System.out.print( temp.data +"=>");
                temp = temp.next;
            }
        }
    
	}
}
class Q02{
	public static void main(String args[]){

		StackLinkList object01=new StackLinkList();
		
		object01.pop();
		System.out.println("----------------------------------");
		object01.peek();
		System.out.println("----------------------------------");
		object01.push("D1");
		object01.push("D2");
		object01.push("D3");
		object01.push("D4");
		object01.push("D5");
		object01.push("D6");
		object01.push("D7");
	    object01.print();
		System.out.println();
	   
		object01.pop();
		object01.pop();
		System.out.println("----------------------------------");
		
		object01.print();
		System.out.println();
		System.out.println("Top Element is "+object01.peek());
		
		object01.print();
	}
}