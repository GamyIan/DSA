package Tree;

public class Node {

	int data;
	Node left=null;
	Node right=null;
	
	Node(int data){
		this.data = data;
	}
	
	Node(int data, Node left, Node right){
		this.data = data;
		this.left = left;
		this.right = right;
	}
	
	void display() {
		System.out.println("Data: "+data);
		System.out.println("Left: "+left.data);
		System.out.println("Right: "+right.data);
	}

}
