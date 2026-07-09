// Last updated: 7/9/2026, 3:06:35 PM


class Solution {
    public long maxRatings(int[][] units) {
        int a = units.length;

        long b = 0;

        long[] c = new long[a];
        long[] d = new long[a];

        HashMap<Long, Integer> e = new HashMap<>();

        for (int f = 0; f < a; f++) {
            int[] g = units[f];

            long h = Long.MAX_VALUE;
            long i = Long.MAX_VALUE;
            int j = 0;

            for (int k : g) {
                if (k < h) {
                    i = h;
                    h = k;
                    j = 1;
                } else if (k == h) {
                    j++;
                } else if (k < i) {
                    i = k;
                }
            }

            long l;

            if (g.length == 1) {
                l = 0;
            } else if (j >= 2) {
                l = h;
            } else {
                l = i;
            }

            c[f] = h;
            d[f] = l - h;

            b += h;

            e.put(h, e.getOrDefault(h, 0) + 1);
        }

        long[] f = c.clone();
        Arrays.sort(f);

        ArrayList<Long> g = new ArrayList<>();
        for (long h : f) {
            if (g.isEmpty() || g.get(g.size() - 1) != h) {
                g.add(h);
            }
        }

        int h = g.size();

        long[] i = new long[h];

        HashMap<Long, Long> j = new HashMap<>();
        for (int k = 0; k < a; k++) {
            j.put(c[k], j.getOrDefault(c[k], 0L) + d[k]);
        }

        long l = 0;
        for (int k = h - 1; k >= 0; k--) {
            l += j.getOrDefault(g.get(k), 0L);
            i[k] = l;
        }

        long[] m = new long[h];
        long[] n = new long[h];

        for (int k = 0; k < h; k++) {
            m[k] = i[k];
            n[k] = i[k] + g.get(k);
        }

        long[] o = new long[h];
        long[] p = new long[h];

        o[h - 1] = m[h - 1];
        for (int k = h - 2; k >= 0; k--) {
            o[k] = Math.max(o[k + 1], m[k]);
        }

        p[0] = n[0];
        for (int k = 1; k < h; k++) {
            p[k] = Math.max(p[k - 1], n[k]);
        }

        HashMap<Long, Integer> q = new HashMap<>();
        for (int k = 0; k < h; k++) {
            q.put(g.get(k), k);
        }

        long r = b;

        for (int s = 0; s < a; s++) {
            long t = c[s];
            long u = d[s];

            int v = q.get(t);

            long w = 0;

            if (v + 1 < h) {
                w = Math.max(w, o[v + 1]);
            }

            long x = Long.MIN_VALUE;

            if (v > 0) {
                x = Math.max(x, p[v - 1]);
            }

            if (e.get(t) >= 2) {
                x = Math.max(x, n[v]);
            }

            if (x != Long.MIN_VALUE) {
                w = Math.max(w, x - u - t);
            }

            r = Math.max(r, b + w);
        }

        return r;
    }
}