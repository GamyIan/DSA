package Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CheckBST {
	
	Node root;
	
	static ArrayList<Integer> inorder(Node root) {
		ArrayList<Integer> inorderList = new ArrayList<>();
		
		Stack<Node> stack = new Stack<>();
		Node curr = root;
		while(!stack.isEmpty() || curr!= null) {
			
			while(curr!=null) {
				stack.push(curr);
				curr = curr.left;
			}
			
			curr = stack.pop();
			inorderList.add(curr.data);
			curr = curr.right;
		}
		
		return inorderList;
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> ogList = new ArrayList<>();
		ArrayList<Integer> sortedList = new ArrayList<>();
		
		Node root = new Node(50);
        Node first = new Node(30);
        Node second = new Node(70);
        Node third = new Node(20);
        Node fourth = new Node(40);
        Node fifth = new Node(60);
        Node sixth = new Node(80);
        
        //link nodes to each other
        root.left = first;
        root.right = second;
        first.left = third;
        first.right = fourth;
        second.left = fifth;
        second.right = sixth;
		
		ogList = inorder(root);
		sortedList = new ArrayList<Integer>(ogList);
		Collections.sort(sortedList);
		
		if (ogList.equals(sortedList)){
			System.out.println("Given tree is a Binary Search Tree");
		} else {
			System.out.println("Given tree is not a Binary Search Tree");
		}
		
		ogList.clear();
		sortedList.clear();
	}

}
