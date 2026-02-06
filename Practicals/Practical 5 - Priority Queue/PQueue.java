import java.util.LinkedList;

class PriorityElement {
    int val, p;
    PriorityElement(int value, int priority){
        this.val = value;
        this.p = priority;
    }

    String display(){
        return "["+val+","+p+"]";
    }

}

class PQueue {
    LinkedList<PriorityElement> queue;
    int highest=0;

    PQueue(){
        queue = new LinkedList<PriorityElement>();
    }

    void enqueue(int value, int priority){
        PriorityElement pElement = new PriorityElement(value, priority);
        queue.add(pElement);
        if (priority>highest) {
            highest=priority;
        }
    }

    PriorityElement dequeue(){
        PriorityElement pElement=null;
        for(int i=1;i<=highest;i++){
            if (queue.get(i).p == i){
                pElement = queue.get(i);
                queue.remove(i);

                break;
            }
        }
        return pElement;
    }

    void display(){
        System.out.print("[");
        for (PriorityElement pElement : queue){
            System.out.print("("+pElement.val+","+pElement.p+"), ");
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        PQueue pq = new PQueue();
        pq.enqueue(10, 6);
        pq.enqueue(69, 0);
        pq.enqueue(67, 1);
        pq.enqueue(15, 3);
        pq.enqueue(12, 3);

        pq.display();
        System.out.println("Dequed: "+pq.dequeue().display());
        System.out.println("Dequed: "+pq.dequeue().display());
        System.out.println("Dequed: "+pq.dequeue().display());

        pq.display();
    }

}