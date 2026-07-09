// Last updated: 7/9/2026, 3:06:11 PM
class Solution {

    ArrayList<Integer>[] a;
    int[] b, c, d;

    public int[] maxSubgraphScore(int n, int[][] edges, int[] good) {

        a = new ArrayList[n];
        for (int i = 0; i < n; i++) a[i] = new ArrayList<>();

        for (int i = 0; i < edges.length; i++) {
            int x = edges[i][0];
            int y = edges[i][1];
            a[x].add(y);
            a[y].add(x);
        }

        b = new int[n];
        c = new int[n];
        d = new int[n];

        for (int i = 0; i < n; i++) {
            b[i] = good[i] == 1 ? 1 : -1;
        }

        dfs1(0, -1);
        dfs2(0, -1, 0);

        return d;
    }

    void dfs1(int x, int p) {
        c[x] = b[x];
        for (int y : a[x]) {
            if (y != p) {
                dfs1(y, x);
                if (c[y] > 0) c[x] += c[y];
            }
        }
    }

    void dfs2(int x, int p, int up) {
        d[x] = c[x] + Math.max(0, up);

        for (int y : a[x]) {
            if (y != p) {
                int v = d[x] - Math.max(0, c[y]);
                dfs2(y, x, v);
            }
        }
    }
}