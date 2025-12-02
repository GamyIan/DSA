import java.util.Stack;

class InfixToPostfix {

    static Stack<Character> stack = new Stack<>();

    static int precedence(char ch) {
        switch (ch){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
        
    }

    public static String convert(String inExp){
        StringBuilder postExp = new StringBuilder();
        for (char ch : inExp.toCharArray()) {
            if (Character.isLetterOrDigit(ch)){
                // Straight to output you go
                postExp.append(ch);
            } 
            else if (ch == '('){
                // push straight onto stakc no thinking
                stack.push(ch);
            }
            else if(ch==')'){
                // if closing bracket then keep popping till u get opening bracket
                while (!stack.isEmpty() && stack.peek()!='('){
                    postExp.append(stack.pop());
                }
                stack.pop(); // to pop out the '(' itself
                
            }
            // If it is an operator I think (idk what I'm doing)
            else { 
                // keep popping if the top of stack has more precedence than the current operator
                while (!stack.isEmpty() && stack.peek()!='(' && (precedence(stack.peek())>=precedence(ch))) { 
                    postExp.append(stack.pop());
                }
                stack.push(ch); // put the operator in the stack
            }
            
        }

        // Pop out remaining shit in stack
        while (!stack.isEmpty()) {  
            postExp.append(stack.pop());
        }

        return postExp.toString();
    }

    public static void main(String[] args){
        String exp1 = "A+(B*C+D)/E";   // 	ABC*D+E/+
        String exp2 = "A+(BC+D)/E+FG";   // ABCD+E/+FG+
        System.out.println(exp1+" --> "+convert(exp1));
        System.out.println(exp2+" --> "+convert(exp2));

    }
}
