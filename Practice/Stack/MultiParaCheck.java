package Stack;

import java.util.HashMap;
import java.util.Stack;

public class MultiParaCheck {

	static HashMap<Character, Character> bracketPairs = new HashMap<>();
	
	static {
		bracketPairs.put('(', ')');
		bracketPairs.put('[', ']');
		bracketPairs.put('{', '}');
	}
	
	static boolean isBalanced(String exp) {
		Stack<Character> stack = new Stack<>();
		
		
		for (char ch : exp.toCharArray()) {
			if (bracketPairs.containsKey(ch)) {
				stack.push(ch);
			}
			
			else if (bracketPairs.containsValue(ch)) {
				if(stack.isEmpty()) {
					return false;
				}
				
				char topBrack = stack.pop();
				if (bracketPairs.get(topBrack) != ch) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
	
// 		Comment out the one u don't want to test
		
		String exp = "{3+5}/[7-3]"; // Balanced
//		String exp = "{3+5}/[7-3](["; // Unbalanced
		
		if (isBalanced(exp)) {
			System.out.println(exp+" is Balanced");
		}
		else {
			System.out.println(exp+" is Unbalanced");
		}
	}

}
