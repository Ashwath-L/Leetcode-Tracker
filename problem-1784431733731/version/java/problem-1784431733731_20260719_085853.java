// Last updated: 7/19/2026, 8:58:53 AM
1class Solution {
2
3    int a = 0;
4
5    public int countDominantNodes(TreeNode root) {
6        b(root);
7        return a;
8    }
9
10    public int b(TreeNode c) {
11        if (c == null) return Integer.MIN_VALUE;
12
13        int d = b(c.left);
14        int e = b(c.right);
15        int f = Math.max(c.val, Math.max(d, e));
16
17        if (c.val == f) {
18            a++;
19        }
20
21        return f;
22    }
23}