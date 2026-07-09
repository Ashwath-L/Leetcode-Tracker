// Last updated: 7/9/2026, 3:06:21 PM
import java.util.*;

class Solution {
    public long finishTime(int n, int[][] edges, int[] baseTime) {
        List<Integer>[] a = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            a[i] = new ArrayList<>();
        }
        for (int[] b : edges) {
            a[b[0]].add(b[1]);
        }
        long[] c = new long[n];
        int[] d = new int[n];
        int e = 0;
        Stack<Integer> f = new Stack<>();
        f.push(0);
        while (!f.isEmpty()) {
            int g = f.pop();
            d[e++] = g;
            for (int h : a[g]) {
                f.push(h);
            }
        }
        for (int i = n - 1; i >= 0; i--) {
            int j = d[i];
            if (a[j].isEmpty()) {
                c[j] = baseTime[j];
            } else {
                long k = Long.MAX_VALUE;
                long l = Long.MIN_VALUE;
                for (int m : a[j]) {
                    k = Math.min(k, c[m]);
                    l = Math.max(l, c[m]);
                }

                c[j] = l + (l - k) + baseTime[j];
            }
        }
        return c[0];
    }
}