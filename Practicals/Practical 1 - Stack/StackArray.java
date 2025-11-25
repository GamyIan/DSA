package DataStructures;

public class StackArray {
	//Attributes
	private int[] stack;
	private int top;
	int size;
	//Constructor
	StackArray(int size){
		this.size = size;
		stack = new int [this.size];
		top = -1;
	}
	
	boolean isEmpty() {
		if (top<0) {
			return true;
		}else {
			return false;
		}
	}
	
	boolean isFull() {
		if (top>=size-1) {
			return true;
		}else {
			return false;
		}
	
	}
	
	void push(int num) {
		if (this.isFull()) {
			System.out.println("Overflow: Stack is already full");
		}
		else {
			top++;
			stack[top]= num;
		}
	}
	
	int pop() {
		if (this.isEmpty()) {
			System.out.println("Underflow: Stack is empty");
			return -1;
		} else {
			top--;
			return stack[top+1];
		}
	}
	
	int peek() {
		if (this.isEmpty()) {
			System.out.println("Underflow: Stack is empty");
			return -1;
		} else {
			return stack[top];
		}
	}
	
	
	public static void main(String[] args) {
		StackArray stack = new StackArray(3);
		
		//stack.pop();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		System.out.println("Peeked: "+stack.peek());
		System.out.println("Popped out: "+stack.pop());
		System.out.println("Popped out: "+stack.pop());
		System.out.println("Popped out: "+stack.pop());
		System.out.println("Popped out: "+stack.pop()); // Should print UnderFlow Error
	
	}

}
