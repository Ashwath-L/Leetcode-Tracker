// Last updated: 7/9/2026, 3:08:32 PM
class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[] visited = new boolean[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                count++;
                bfs(i, isConnected, visited);
            }
        }

        return count;
    }

    public void bfs(int start, int[][] isConnected, boolean[] visited) {
        Queue<Integer> temp = new LinkedList<>();

        temp.offer(start);
        visited[start] = true;

        while (!temp.isEmpty()) {
            int city = temp.poll();

            for (int j = 0; j < isConnected.length; j++) {
                if (isConnected[city][j] == 1 && !visited[j]) {
                    visited[j] = true;
                    temp.offer(j);
                }
            }
        }
    }
}