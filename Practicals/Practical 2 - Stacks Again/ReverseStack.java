import java.util.Stack;

public class ReverseStack{
    public static Stack<Integer> reverseStack(Stack<Integer> ogStack)
    {
        Stack<Integer> tempStack = new Stack<Integer>();
        
        while(!ogStack.isEmpty()){
            tempStack.push(ogStack.pop());
        }

        return tempStack;

    }

    public static void main(String[] args){
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(10); 
        stack.push(20); 
        stack.push(30); 
        stack.push(40);
        
        System.out.println("Original Stack: "+stack);
        System.out.println("Reversed Stack: "+reverseStack(stack));
    }

}