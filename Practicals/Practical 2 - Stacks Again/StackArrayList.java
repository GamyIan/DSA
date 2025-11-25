import java.util.Stack;
import java.util.ArrayList;


public class StackArrayList{
    ArrayList<Integer> arrStack = new ArrayList<>();

    public boolean isEmpty(){
        return arrStack.isEmpty();
    }

    public int push(int value){
        arrStack.add(value);
        return arrStack.get(arrStack.size()-1);
    }

    public int pop(){
        if(arrStack.isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        return arrStack.remove(arrStack.size()-1);
    }

    public int peek(){
        if(arrStack.isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        return arrStack.get(arrStack.size()-1);
    }

    public static void main(String[] args){
        StackArrayList stack = new StackArrayList();

        System.out.println("Pushed: "+stack.push(10));
        System.out.println("Pushed: "+stack.push(20));
        System.out.println("Pushed: "+stack.push(30));
        
        System.out.println("Peeked: "+stack.peek());

        System.out.println("Popped: "+stack.pop());
        System.out.println("Popped: "+stack.pop());
        System.out.println("Popped: "+stack.pop());
        System.out.println("Popped: "+stack.pop());

    }

}