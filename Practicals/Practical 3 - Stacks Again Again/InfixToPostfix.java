import java.util.Stack;
import java.util.HashMap;
import java.util.Map;

class InfixToPostfix {
    static HashMap<Character, Integer> precedenceMap = new HashMap<>();
    static {
        precedenceMap.put('+',1);
        precedenceMap.put('-',1);
        precedenceMap.put('*',2);
        precedenceMap.put('/',2);
        precedenceMap.put('^',3);
    }

    static Stack<Character> stack = new Stack<>();


    static boolean isPreceding(char ch) {
        if (precedenceMap.containsKey(ch)){
            if (precedenceMap.get(ch) >= precedenceMap.get(stack.peek())){
                return true;
            }
            else {
                return false;
            }
        }
        else{
            return false;
        }
        
    }

    public static String convert(String inExp){
        StringBuilder postExp = new StringBuilder();
        for (char ch : inExp.toCharArray()){
            if (Character.isLetterOrDigit(ch)){
                postExp.append(ch);
            } 
            else if (ch == '('){
                stack.push(ch);
            }
            else if(ch==')'){
                while (!stack.isEmpty()){
                    char top = stack.pop();
                    if (top == '('){
                        break;
                    }
                    postExp.append(top);
                }
            }
            else { // If it is an operator I think idk what I'm doing
                while (!stack.isEmpty() && stack.peek()!='(' && !isPreceding(ch)){
                    postExp.append(stack.pop());
                }
                stack.push(ch);
            }
            
        }

        while (!stack.isEmpty()){
            postExp.append(stack.pop());
        }

        return postExp.toString();
    }

    public static void main(String[] args){
        String exp1 = "A+(B*C+D)/E";   // 	ABC*D+E/+
        String exp2 = "A+(BC+D)/E+FG";   // ABCD+E/+FG+
        System.out.println(exp1+": "+convert(exp1));
        System.out.println(exp2+": "+convert(exp2));

    }
}
