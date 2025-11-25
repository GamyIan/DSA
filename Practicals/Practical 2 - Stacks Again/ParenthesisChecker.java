import java.util.Stack;

class ParenthesisChecker{
    
    public static boolean isBalanced(String exp){

        Stack<Character> stack = new Stack<>();

        for (int i=0; i<exp.length();i++){
            char ch = exp.charAt(i);

            if(ch=='('){
                stack.push(ch);
            }
            else if(ch==')'){
                if(stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args){


        String exp1 = "50+28-(9*10)";    // Balanced
        String exp2 = "50+28)-(9*10)("; // Unbalanced

        System.out.println(exp1+": "+isBalanced(exp1));
        System.out.println(exp2+": "+isBalanced(exp2));


    }

}