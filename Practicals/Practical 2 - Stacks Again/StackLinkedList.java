import java.util.Stack;
import java.util.LinkedList;


public class StackLinkedList{
    LinkedList<Integer> arrStack = new LinkedList<>();

    public boolean isEmpty(){
        return arrStack.isEmpty();
    }

    public int push(int value){
        arrStack.addLast(value);
        return arrStack.getLast();
    }

    public int pop(){
        if(arrStack.isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        return arrStack.removeLast();
    }

    public int peek(){
        if(arrStack.isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        return arrStack.getLast();
    }

    public static void main(String[] args){
        StackLinkedList stack = new StackLinkedList();

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