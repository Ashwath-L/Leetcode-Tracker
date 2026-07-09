// Last updated: 7/9/2026, 3:10:16 PM
class Solution {
    public int largestRectangleArea(int[] a) {
        Stack<Integer> b = new Stack<>();
        int c = 0;

        for (int i = 0; i <= a.length; i++) {
            int d = (i == a.length) ? 0 : a[i];

            while (!b.isEmpty() && a[b.peek()] > d) {
                int e = a[b.pop()];
                int f = b.isEmpty() ? i : i - b.peek() - 1;
                c = Math.max(c, e * f);
            }

            b.push(i);
        }

        return c;
    }
}