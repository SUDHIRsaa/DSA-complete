# BFS Traversal - Java Implementation

```java
import java.util.*;
// GFG
class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] val = new boolean[adj.size()];

        q.add(0);        // Starting from node 0
        val[0] = true;

        while (!q.isEmpty()) {
            int aa = q.poll();
            arr.add(aa);
            for (int a : adj.get(aa)) {
                if (!val[a]) {
                    val[a] = true;
                    q.add(a);
                }
            }
        }

        return arr;
    }
}

# DFS TRAVERSAL
```java
// GFG
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
    ArrayList<Integer> arr=new ArrayList<>();
    boolean val[]=new boolean[adj.size()];
    val[0]=true;
    ds(0,val,adj,arr);
    return arr;
    
    }
     public static void ds(int node, boolean vis[], ArrayList<ArrayList<Integer>> adj, 
    ArrayList<Integer> ls) {
        
      
        vis[node] = true;
        ls.add(node);
        
        //getting neighbour nodes
        for(Integer it: adj.get(node)) {
            if(vis[it] == false) {
                ds(it, vis, adj, ls);
            }
        }
    }
}