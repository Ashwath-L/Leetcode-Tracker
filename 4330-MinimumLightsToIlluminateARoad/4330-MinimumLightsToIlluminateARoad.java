// Last updated: 7/9/2026, 3:05:24 PM
class Solution {
    public int minLights(int[] lights) {

        int n = lights.length;

        int[] a = new int[n + 1];

        for (int i = 0; i < n; i++) {
            if (lights[i] > 0) {
                int l = Math.max(0, i - lights[i]);
                int r = Math.min(n - 1, i + lights[i]);

                a[l]++;
                if (r + 1 < n) {
                    a[r + 1]--;
                }
            }
        }

        boolean[] b = new boolean[n];
        int c = 0;

        for (int i = 0; i < n; i++) {
            c += a[i];
            b[i] = c > 0;
        }

        int d = 0;
        int i = 0;

        while (i < n) {
            if (b[i]) {
                i++;
                continue;
            }

            int e = 0;

            while (i < n && !b[i]) {
                e++;
                i++;
            }

            d += (e + 2) / 3;
        }

        return d;
    }
}