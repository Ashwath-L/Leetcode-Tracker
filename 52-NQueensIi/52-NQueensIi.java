// Last updated: 7/9/2026, 3:10:42 PM
class Solution {
    int a = 0;

    public int totalNQueens(int n) {
        char[][] b = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(b[i], '.');
        }

        c(b, 0);
        return a;
    }

    void c(char[][] b, int d) {
        if (d == b.length) {
            a++;
            return;
        }

        for (int i = 0; i < b.length; i++) {
            if (e(b, d, i)) {
                b[d][i] = 'Q';
                c(b, d + 1);
                b[d][i] = '.';
            }
        }
    }

    boolean e(char[][] b, int c, int d) {
        for (int i = 0; i < c; i++)
            if (b[i][d] == 'Q')
                return false;

        for (int i = c - 1, j = d - 1; i >= 0 && j >= 0; i--, j--)
            if (b[i][j] == 'Q')
                return false;

        for (int i = c - 1, j = d + 1; i >= 0 && j < b.length; i--, j++)
            if (b[i][j] == 'Q')
                return false;

        return true;
    }
}