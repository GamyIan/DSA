import java.util.Stack;

public class PushBottomRecursion{

    Stack<Integer> stack = new Stack<Integer>();

    void push(int value){
        stack.push(value);
    }

    public void pushBottom(int value){
        if(stack.isEmpty()){
            stack.push(value);
            return;
        }

        int temp=stack.pop();
        pushBottom(value);
        push(temp);


    }

    public Stack<Integer> get(){
        return stack;
    }


    public static void main(String[] args){
        PushBottomRecursion stack = new PushBottomRecursion();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pushBottom(40);

        System.out.println("Stack: "+stack.get());
    }
}