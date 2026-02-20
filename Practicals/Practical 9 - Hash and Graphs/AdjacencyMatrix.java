public class AdjacencyMatrix {
    public static void main(String[] args) {
        int V = 5;
        int[][] adjMat = new int[V][V];

        for (int i=0;i<V;i++){
            for (int j=0;j<V;j++){
                adjMat[i][j] = 0;
            }
        }

        adjMat[0][1] = 1;
        adjMat[0][4] = 1;
        adjMat[1][0] = 1;
        adjMat[1][2] = 1;
        adjMat[1][3] = 1;
        adjMat[1][4] = 1;
        adjMat[2][1] = 1;
        adjMat[2][3] = 1;
        adjMat[3][2] = 1;
        adjMat[3][4] = 1;
        adjMat[4][0] = 1;
        adjMat[4][1] = 1;
        adjMat[4][3] = 1;

        System.out.println("adjMat = [");
        for (int i=0;i<V;i++){
            for (int j=0;j<V;j++){
                System.out.print(adjMat[i][j]+", ");
            }
            System.out.println();
        }
        System.out.println("]");
    }
}
