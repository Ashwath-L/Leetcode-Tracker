// Last updated: 7/9/2026, 3:06:16 PM
class Solution {
    public long totalScore(int hp, int[] damage, int[] requirement) {

        int n = damage.length;
        long[] a = new long[n + 1];

        for (int b = 0; b < n; b++) {
            a[b + 1] = a[b] + damage[b];
        }

        long[] b = new long[n];
        for (int c = 0; c < n; c++) {
            b[c] = a[c + 1] + requirement[c];
        }

        long[] c = b.clone();
        Arrays.sort(c);

        int[] d = new int[n + 1];
        long ans = 0;

        for (int i = n - 1; i >= 0; i--) {

            int x = Arrays.binarySearch(c, b[i]) + 1;
            while (x <= n) {
                d[x]++;
                x += x & -x;
            }

            long limit = hp + a[i];
            int y = upper(c, limit);

            int sum = 0;
            while (y > 0) {
                sum += d[y];
                y -= y & -y;
            }

            ans += sum;
        }

        return ans;
    }

    int upper(long[] a, long v) {
        int l = 0, r = a.length;
        while (l < r) {
            int m = (l + r) / 2;
            if (a[m] <= v) l = m + 1;
            else r = m;
        }
        return l;
    }
}