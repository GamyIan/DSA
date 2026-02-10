// Indexes:
// Left child index = 2*i +1
// Right child index = 2*i + 2
// Parent index = (i-1)/2 WRONG

class BTUsingArray {
    int[] tree;
    int size;

    BTUsingArray(int size) {
        tree = new int[size];
        size=0;
    }

    void insert(int val){
        if(size>tree.length){
            System.out.println("Tree is already full");
            return;
        }
        tree[size] = val;
        size++;
    }

    void display(){
        for (int i=0;i<size;i++){
            System.out.println(tree[i]+" ");
        }
    }

    public static void main(String[] args) {
        BTUsingArray myBT = new BTUsingArray(5);
        myBT.insert(10);
        myBT.insert(5);
        myBT.insert(15);
        myBT.insert(2);
        myBT.insert(7);

        myBT.display();
    }
}