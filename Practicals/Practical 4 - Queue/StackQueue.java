import java.util.Stack;

class StackQ{
    Stack<Integer> main,alt;

    StackQ(){
        main = new Stack<Integer>();
        alt = new Stack<Integer>();
    }

    void enQ(int value){
        main.push(value);
    }
    
    int dequeue(){
        Stack<Integer> temp = main;
        for (int val : main){
            alt.push(main.pop());
        }
        main=temp;
        



    }
}