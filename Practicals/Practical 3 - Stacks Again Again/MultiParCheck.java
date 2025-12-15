import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.HashMap;

public class MultiParCheck {
    public static void main(String[] args) {
        String balExp = "{3+5}/(7-3)";
        //String unbalExp = "[3+5}/(7-3)"; //Checking for unbalanced expression
        boolean isBalanced = true;
        Stack<Character> stack = new Stack<>();

        ArrayList<Character> openBrackList = new ArrayList<Character>(Arrays.asList('(','{','['));
        ArrayList<Character> closedBrackList = new ArrayList<Character>(Arrays.asList(')','}',']'));

        // Like a Python Dictionary to store the closing bracket and corresponding opening bracket
        HashMap<Character,Character> brackPairMap = new HashMap<Character,Character>();
        brackPairMap.put(')','(');
        brackPairMap.put('}','{');
        brackPairMap.put(']','[');

        //for (char ch : unbalExp.toCharArray()){
        for (char ch : balExp.toCharArray()){
            if (openBrackList.contains(ch)){
                // if character is opening bracket push onto stack
                stack.push(ch);
            }
            // if stack is closing bracket
            else if (closedBrackList.contains(ch)){
                // if stack is empty exp is unbalanced as there is no corresponding opening bracket
                if (stack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                // if not empty then check if correct pair of brackets
                char top = stack.pop(); // gets the opening bracket
                if (brackPairMap.containsKey(top)){
                    // if opening bracket is not the mapped value of the closing bracket then unbalanced
                    if (brackPairMap.get(ch)!=top){ // ch has the closing bracket, top has the opening bracket
                    isBalanced = false;
                    break;
                    }
                }
                
            }

        }

        System.out.println(balExp+": "+isBalanced);
        //System.out.println(unbalExp+": "+isBalanced);
    }
}
