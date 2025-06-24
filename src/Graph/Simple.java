package Graph;
import java.util.ArrayList;

public class Simple {
    public static void main(String[] args) {
        int n = 5; // Number of nodes
        int m = 6; // Number of edges

        // Sample edges (undirected)
        int[][] edges = {
            {1, 2},
            {1, 3},
            {2, 4},
            {3, 4},
            {4, 5},
            {2, 5}
        };

        // -----------------------------
        // Adjacency Matrix
        // -----------------------------
        int[][] adjMatrix = new int[n + 1][n + 1]; // 1-based indexing

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // since undirected
        }

        // Print Adjacency Matrix
        System.out.println("Adjacency Matrix:");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }

        // -----------------------------
        // Adjacency List
        // -----------------------------
        ArrayList<ArrayList<Integer>> adjList = new ArrayList<>();

        // Initialize lists
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            adjList.get(u).add(v);
            adjList.get(v).add(u); // since undirected
        }

        // Print Adjacency List
        System.out.println("\nAdjacency List:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " -> ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}
