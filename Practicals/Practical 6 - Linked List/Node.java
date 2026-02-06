public class Node {
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