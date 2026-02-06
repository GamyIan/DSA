class ArrayQueue {
    int[] queue;
    int front,rear, size;

    ArrayQueue(int size){
        this.front = 0;
        this.queue = new int[size];
        this.size = 0;
        this.rear = -1;
    }

    public void enqueue(int value){
        if (size >= queue.length) {
            System.out.println("Cannot queue value...\nQueue is Full");
        }
        else{
            rear++;
            queue[rear]=value;
            size++;
        }
    }

    public int dequeue(){
        try{

            if (size==0){
                System.out.println("Nothing to dequeue");
                return null;
                
            }
            else{
                int value = queue[0];
                for(int i=1;i<size;i++){
                    queue[i-1]=queue[i];
                }
                size--;
                return value;
    
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

}