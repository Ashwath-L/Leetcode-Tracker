// Last updated: 7/9/2026, 3:07:08 PM
import java.util.*;

class Solution {
    int ans = 0;

    void BFS(List<Integer>[] adj, boolean[] vis, int n, int src) {
        Queue<Integer> q = new LinkedList<>();
        q.add(src);
        vis[src] = true;
        
        int nodecount = 0;
        int edgecount = 0;
      
        while (!q.isEmpty()) {
            int node = q.poll();
            nodecount++;
            
            for (int x : adj[node]) {
                if (vis[x] == false) {
                    q.add(x);
                    vis[x] = true;
                }
                edgecount++;
            }
        }
        
        // Check if the connected component is a complete graph
        if ((long) nodecount * (nodecount - 1) == edgecount) {
            ans++;
        }
    }

    public int countCompleteComponents(int n, int[][] e) {
        // Initialize the adjacency list
        List<Integer>[] adj = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
        
        // Build the graph
        for (int i = 0; i < e.length; i++) {
            adj[e[i][0]].add(e[i][1]);
            adj[e[i][1]].add(e[i][0]);
        }
        
        boolean[] vis = new boolean[n];
        
        // Traverse all components
        for (int i = 0; i < n; i++) {
            if (vis[i] == false) {
                BFS(adj, vis, n, i);
            }
        }
        
        return ans;
    }
}