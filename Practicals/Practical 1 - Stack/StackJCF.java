import java.util.EmptyStackException;
import java.util.Stack;

public class StackJCF {

	public static void main(String[] args) {
		try {
			Stack<Integer> stack = new Stack<Integer>();
			
			//Push Operations
			stack.push(10);
			stack.push(20);
			stack.push(30);
			stack.push(40);
			
			//Peek Operation
			System.out.println("Peeked: "+stack.peek());
			
			//Pop Operations
			System.out.println("Popped: "+stack.pop());
			System.out.println("Popped: "+stack.pop());
			System.out.println("Popped: "+stack.pop());
			System.out.println("Popped: "+stack.pop());
			System.out.println("Popped: "+stack.pop()); // Should throw error
		} catch (EmptyStackException e) {
			System.out.println("[Error] Stack might be Empty");
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
