class Node {
    int data;
    Node next;

    Node(int data){
        this.data=data;
    }

    Node(int data,Node next){
        this.data=data;
        this.next = next;
    }

    void setData(int data){
        this.data = data;
    }

    int getData(){
        return this.data;
    }

    void setNext(Node next){
        this.next = next;
    }

    Node getNext(){
        return this.next;
    }
}

class InsertEnd {
    public static void main(String[] args){
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        first.setNext(second);
        second.setNext(third);

        System.out.println("Traversing the Original Linked List:");

        Node curr = first;
        while(curr!=null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }

        // Creating and linking the new node 
        Node newNode = new Node(35);
        third.setNext(newNode);

        System.out.println("Traversing the new LinkedList:");
        curr = first;
        while(curr!=null){
            System.out.println(curr.getData());
            curr = curr.getNext();
        }
    }
}