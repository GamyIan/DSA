	class Stack{
	
	public static void main(String[] args) {
		int[] stack = new int[5];  // Representation of Stack
		
		int top = -1; // Select top as the index with value -1 to symbolize empty stack
		
		//Push operations
		top++; //Incrementing the top
		stack[top] = 10; // Push
		
		top++; //Incrementing the top
		stack[top] = 20; // Push
		
		top++; //Incrementing the top
		stack[top] = 30; // Push
		
		//Peek + Pop operation
		while(top > -1) { //While not empty
			System.out.println("Peeked: "+stack[top]); // Peeking the top
			top--; // pop the top
		}
		
		System.out.println("Stack is now empty");
	}

}