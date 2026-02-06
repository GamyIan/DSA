class CircularQueue
{
    public void enqueue(int data)
    {
        if(size==capacity)
        {
            System.out.println("Queue is full");
        }
        else 
        {
            rear = (rear +1) % capacity;
            queue[rear] = data;
            size++;
        }
    }

    int dequeue()
    {
        if (size==0)
        {
            System.out.println("Queue is already empty");
            return null;
        }

        int value = queue[front];
        front = (front + 1) % capacity;
        size--;
        return value;
    }

    display(){
        int count = size;
        int i = front;
        while(count>0){
            System.out.println(queue[i]+" ");
            i = (i+1)%capacity;
            count--;
        }
        System.out.println();


        
    }
}


