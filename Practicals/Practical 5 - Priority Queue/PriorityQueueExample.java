import java.util.PriorityQueue;

class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(10);
        pq.add(65);
        pq.add(20);
        pq.add(50);
        pq.add(100);
        pq.add(70);

        System.out.println("Elements in the priority qeueue: " + pq);

        while(!pq.isEmpty()){
            System.out.println("Element served: " + pq.poll());
        }
    }
}