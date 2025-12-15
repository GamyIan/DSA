import java.util.Stack;

public class PushBottomRecursion extends Stack<Integer>{

    public void pushBottom(int value){
        if(this.isEmpty()){
            this.push(value);
            return;
        }

        int temp=this.pop();
        pushBottom(value);
        push(temp);
    }


    public static void main(String[] args){
        PushBottomRecursion stack = new PushBottomRecursion();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        stack.pushBottom(40);

        System.out.println("Stack: "+stack);
    }
}