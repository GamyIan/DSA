class Node {
    int data;
    Node left;
    Node right;

    Node(int value){
        data=value;
        left=null;
        right=null;
    }

    Node (int value, Node left, Node right){
        data=value;
        this.left=left;
        this.right=right;
    }

    Node getLeft(){
        return this.left;
    }


    Node getRight(){
        return this.right;
    }

    void setLeft(Node left){
        this.left = left;
        System.out.println("Node added to left.");

    }

    
    void setRight(Node right){
        this.right = right;
        System.out.println("Node added to Right.");

    }

    void display(){
    System.out.printf("  %d%n", this.data);
    if (left != null || right != null) {
        System.out.printf(" /   \\%n");
        System.out.printf("%d     %d%n",
                left != null ? left.data : "",
                right != null ? right.data : "");
    }
}



}

public class SimpleBinaryTree {
    Node root;

    SimpleBinaryTree(int[] list) {
        if (list.length == 0) return;

        Node[] nodes = new Node[list.length];

        // Create all nodes
        for (int i = 0; i < list.length; i++) {
            nodes[i] = new Node(list[i]);
        }

        // Link children
        for (int i = 0; i < list.length; i++) {
            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;

            if (leftIndex < list.length) {
                nodes[i].left = nodes[leftIndex];
            }
            if (rightIndex < list.length) {
                nodes[i].right = nodes[rightIndex];
            }
        }

        root = nodes[0];
    }

    void postorder(Node root){
        if (root==null){
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+", ");
    }

    public static void main(String[] args) {
        int[] myList = {1,2,3,4,5,6};
        SimpleBinaryTree myBT = new SimpleBinaryTree(myList);
        myBT.postorder(myBT.root);
        System.out.println();
    }
}
    
