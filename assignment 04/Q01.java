class Stck{
	static final int MAX = 5;
    int top;
    int array[] = new int[MAX];
	
	Stck(){
		top=-1;
	}
	
	boolean IsEmpty(){
		return (top<0);
	}
	int IsFull(){
		 return (top = MAX-1);
	 }
	void push( int element){
		if (top == MAX-1) { 
			System.out.println("Stack is Overflow");
		}
        else {
            array[++top] = element;
            System.out.println(element + " pushed into stack");    
        }
	  }
	int  pop(){
		if(IsEmpty()){
			System.out.println("Stack is Underflow");
			return 0;
		}
		else{
			int element=array[top--];
			return element;    
		}
	}	
	
	int peek(){
		if (top < 0) {
            System.out.println("Stack is Empty");
            return 0;
        }
        else	{
            int x = array[top];
            return x;
        }
	}

	void print(){
		for(int i=top;i>-1;i--){
			System.out.print(array[i]+"||");	
		}
	}	  
}

class TestStck{
	public static void main(String args[]){
		
		Stck stck01=new Stck();
		
		stck01.pop();
		stck01.peek();
		stck01.push(10);
		stck01.push(20);
		stck01.push(30);
		stck01.push(40);
		stck01.push(50);
		stck01.push(60);
		stck01.push(70);
		System.out.println("----------------------------");
		stck01.pop();
		stck01.pop();
		System.out.println("Top element is:"+stck01.peek());
		stck01.print();	
	}
}