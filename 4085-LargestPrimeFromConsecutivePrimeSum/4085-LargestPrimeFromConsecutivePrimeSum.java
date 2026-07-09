// Last updated: 7/9/2026, 3:06:23 PM
class Solution {
    public int largestPrime(int n) {

        boolean[] a = new boolean[n + 1];
        Arrays.fill(a, true);
        if (n >= 0) a[0] = false;
        if (n >= 1) a[1] = false;

        for (int b = 2; b * b <= n; b++) {
            if (a[b]) {
                for (int c = b * b; c <= n; c += b) {
                    a[c] = false;
                }
            }
        }

        ArrayList<Integer> d = new ArrayList<>();
        for (int b = 2; b <= n; b++) {
            if (a[b]) d.add(b);
        }

        int e = 0, c = 0;
        for (int b = 0; b < d.size(); b++) {
            c += d.get(b);
            if (c > n) break;
            if (a[c]) e = c;
        }

        return e;
    }
}