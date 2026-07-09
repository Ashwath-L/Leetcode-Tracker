// Last updated: 7/9/2026, 3:10:15 PM
class Solution {
    public int maximalRectangle(char[][] a) {
        if (a.length == 0) return 0;

        int[] b = new int[a[0].length];
        int c = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (a[i][j] == '1')
                    b[j]++;
                else
                    b[j] = 0;
            }

            c = Math.max(c, d(b));
        }

        return c;
    }

    int d(int[] a) {
        Stack<Integer> b = new Stack<>();
        int c = 0;

        for (int i = 0; i <= a.length; i++) {
            int e = (i == a.length) ? 0 : a[i];

            while (!b.isEmpty() && a[b.peek()] > e) {
                int f = a[b.pop()];
                int g = b.isEmpty() ? i : i - b.peek() - 1;
                c = Math.max(c, f * g);
            }

            b.push(i);
        }

        return c;
    }
}