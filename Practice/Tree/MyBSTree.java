package Tree;

import java.util.Stack;

public class MyBSTree {

	Node root;
	
	MyBSTree(Node root){
		this.root=root;
	}
	
	MyBSTree(){
		this.root=null;
	}
	
	Node insert(Node root, int value) {
		if (root==null) {
			return new Node(value);
		}
		
		if (value < root.data) {
			root.left = insert(root.left, value);
		} else if (value > root.data) {
			root.right = insert(root.right, value);
		}
		
		return root;
	}
	
	void insert(int value) {
		this.root = insert(this.root, value);
	}
	
	void inorder() {
		System.out.print("Inorder: { ");
		inorder(this.root);
		System.out.println("}\n");
	}
	
	void inorder(Node root) {
		
		if (root==null) {
			return;
		}
		
		inorder(root.left);
		System.out.print(root.data+", ");
		inorder(root.right);
	}
	
	void preorder(Node root) {
		
		if (root==null) {
			return;
		}
		
		System.out.print(root.data+", ");
		preorder(root.left);
		preorder(root.right);
	}
	
	void preorder() {
		System.out.print("Preorder: { ");
		preorder(this.root);
		System.out.println("}\n");
	}
	
	void postorder(Node root) {
		
		if (root==null) {
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data+", ");
	}
	
	void postorder() {
		System.out.print("Postorder: { ");
		postorder(this.root);
		System.out.println("}\n");
	}
	
	Node remove(Node root, int value) {
		if (root==null) {
			return root;
		}
		
		if(value < root.data) {
			root.left = remove(root.left, value);
		} else if (value > root.data) {
			root.right = remove(root.right, value);
		} else {
			
			// If leaf node
			if (root.left==null && root.right==null) {
				return null;
			} // If no left child then just attach the right child of the node to parent
			else if (root.left==null) {
				return root.right;
			}
			else if (root.right==null) {
				return root.left;
			} // Two children ;-;
			else {
				root.data = minValue(root.right);
				root.right = remove(root.right, root.data);
			}
			
		}
		
		return root;
		
	}
	
	void remove(int value) {
		this.root = remove(this.root,value);
	}
	
	
	int minValue(Node root) {
		
		while(root.left != null) {
			root = root.left;
		}
		int min = root.data;
		
		return min;
	}
	
	static boolean search(Node root, int value) {
		if (root==null) {
			return false;
		}
		
		if(root.data == value) {
			return true;
		}
		
		if (value < root.data) {
			return search(root.left, value);
		}
		
		return search(root.right, value);
	}
	
	void search(int value) {
		search(this.root, value);
	}
	
	boolean searchIterative(int value) {
		return searchIterative(this.root, value);
	}
	
	boolean searchIterative(Node root, int value){
		Node curr = root;
		
		Stack<Integer> path = new Stack<>();
		
		while(curr!=null) {
			int data = curr.data;
			path.push(data);
			if (value == data) {
				System.out.println(value+" Found!\nPath: "+path);
				return true;
			}
			else if(value < data) {
				curr = curr.left;
			} else {
				curr = curr.right;
			}
		}
		System.out.println(value+" not Found in Tree...");
		return false;
	}
	
	public static void main(String[] args) {
		Node root = new Node(50);
		
		MyBSTree tree = new MyBSTree(root);
		tree.insert(20);
		tree.insert(10);
		tree.insert(30);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(80);
		
		tree.inorder();
//		tree.preorder();
//		tree.postorder();
		
//		tree.remove(10); // Leaf
//		tree.remove(20); // One Child
//		tree.remove(50); // Trying to delete the root node 💀
		tree.remove(30); // Two children
		
		System.out.println("After removal:");
		tree.inorder();
		
		tree.searchIterative(10);
		
	}

}
