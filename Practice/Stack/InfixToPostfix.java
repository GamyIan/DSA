package Stack;

import java.util.HashMap;
import java.util.Stack;

public class InfixToPostfix {
	
	static HashMap<Character,Integer> precedence = new HashMap<>();
	
	static {
		precedence.put('+', 0);
		precedence.put('-', 0);
		precedence.put('*', 1);
		precedence.put('/', 1);
	}
	
	static String convert(String exp) {
		Stack<Character> stack = new Stack<Character>();
		StringBuilder postExp = new StringBuilder();
		for (char ch : exp.toCharArray()) {
			
			if (Character.isLetterOrDigit(ch)) {
				postExp.append(ch);
			}
			else if (ch == '(') {
				stack.push(ch);
			}
			else if (ch == ')') {
				while(!stack.isEmpty() && stack.peek()!='(') {
					postExp.append(stack.pop());
				}
				stack.pop(); // Pop out the ( itself
			} 
			else { // If Operator
				
				while(!stack.isEmpty() 
						&& stack.peek()!='('
						&& precedence.get(ch)<=precedence.get(stack.peek()))
					{
					postExp.append(stack.pop());
				}
				stack.push(ch);
			}
		}
		while(!stack.isEmpty()) {
			postExp.append(stack.pop());
		}
		
		return postExp.toString();
		
		
	}
	
	
	public static void main(String[] args) {
		String exp = "A*B+(D-E)";
		System.out.println("Infix: "+exp+"\nPostFix: "+convert(exp));
	}

}
