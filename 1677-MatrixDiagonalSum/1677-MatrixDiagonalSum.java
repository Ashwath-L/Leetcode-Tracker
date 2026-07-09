// Last updated: 7/9/2026, 3:07:30 PM
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int a = 0;
        for (int i = 0; i < n; i++) {
            a += mat[i][i];
            a += mat[n - 1 - i][i];
        }
        if (n % 2 != 0) {
            a -= mat[n / 2][n / 2];
        }
        return a;
    }
}