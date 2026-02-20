import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class AdjacencyList {
    int vertices;
    HashMap<Integer, HashSet<Integer>> adjList = new HashMap<>();
    Scanner sc = new Scanner(System.in);

    AdjacencyList(int vertices){
        this.vertices = vertices;
        for(int i=0;i<vertices;i++){
            System.out.println("Enter vertice: ");
            int vertex = sc.nextInt();
            HashSet<Integer> linkedVertices = getVertices(vertex);
            adjList.put(vertex,linkedVertices);
        }
    }

    HashSet<Integer> getVertices(int parentVertex){
        HashSet<Integer> verticeList = new HashSet<>();

        System.out.println("Enter number of connected vertices for vertex ("+parentVertex+")");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("Enter Connected Vertex "+(i+1)+": ");
            int vertex = sc.nextInt();
            verticeList.add(vertex);
        }
        return verticeList;
    }

    void display(){
        System.out.println("Adjacency List: {");
        for (int key : adjList.keySet()){
            System.out.println(key+" --> "+adjList.get(key)+", ");
        }
        System.out.println("}");
    }

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter number of vertices: ");
        int vertices = scr.nextInt();
        AdjacencyList adjList = new AdjacencyList(vertices);
        adjList.display();
        scr.close();
    }
}
