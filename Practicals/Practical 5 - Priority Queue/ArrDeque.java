import java.util.ArrayDeque;

class ArrDeque{
    
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addLast(10);
        deque.addLast(5);
        deque.addFirst(69);
        deque.addLast(67);

        System.out.println("DE Queue:"+deque);
        System.out.println("Removed First: "+deque.removeFirst());
        System.out.println("Removed Last: "+deque.removeLast());
        System.out.println("DE Queue:"+deque);


    }


}