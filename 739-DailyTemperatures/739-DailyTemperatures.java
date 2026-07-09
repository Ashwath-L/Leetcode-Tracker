// Last updated: 7/9/2026, 3:08:04 PM
class Solution {
    public int[] dailyTemperatures(int[] a) {
        int n = a.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && a[stack.peek()] < a[i]) {
                int idx = stack.pop();
                ans[idx] = i - idx;
            }
            stack.push(i);
        }

        return ans;
    }
}