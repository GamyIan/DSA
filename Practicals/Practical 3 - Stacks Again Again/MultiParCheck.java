import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;
import java.util.HashMap;

public class MultiParCheck {
    public static void main(String[] args) {
        String balExp = "{3+5}/(7-3)";
        //String balExp = "[3+5}/(7-3)"; //Checking for unbalanced expression
        boolean isBalanced = true;
        Stack<Character> stack = new Stack<>();
        ArrayList<Character> openBrackList = new ArrayList<Character>(Arrays.asList('(','{'));
        ArrayList<Character> closedBrackList = new ArrayList<Character>(Arrays.asList(')','}'));
        HashMap<Character,Character> brackPairMap = new HashMap<Character,Character>();
        brackPairMap.put(')','(');
        brackPairMap.put('}','{');
        brackPairMap.put(']','[');


        for (char ch : balExp.toCharArray()){
            if (openBrackList.contains(ch)){
                stack.push(ch);
            }
            else if (closedBrackList.contains(ch)){
                if (stack.isEmpty()){
                    isBalanced = false;
                    break;
                }
                char top = stack.pop();
                if (brackPairMap.containsKey(top)){
                    if (top!=brackPairMap.get(ch)){
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
