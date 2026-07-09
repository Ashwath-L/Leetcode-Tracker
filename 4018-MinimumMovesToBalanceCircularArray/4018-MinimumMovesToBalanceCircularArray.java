// Last updated: 7/9/2026, 3:06:32 PM
class Solution {
    public long minMoves(int[] balance) {

        int n = balance.length;
        int p = -1;
        long s = 0;

        for (int i = 0; i < n; i++) {
            s += balance[i];
            if (balance[i] < 0) p = i;
        }

        if (p == -1) return 0;
        if (s < 0) return -1;

        int[][] a = new int[n][2];
        int k = 0;

        for (int i = 0; i < n; i++) {
            if (i != p && balance[i] > 0) {
                int d = Math.abs(i - p);
                int dist = Math.min(d, n - d);
                a[k][0] = dist;
                a[k][1] = balance[i];
                k++;
            }
        }

        Arrays.sort(a, 0, k, (x, y) -> x[0] - y[0]);

        long need = -balance[p];
        long ans = 0;

        for (int i = 0; i < k && need > 0; i++) {
            long take = Math.min(a[i][1], need);
            ans += take * a[i][0];
            need -= take;
        }

        return ans;
    }
}