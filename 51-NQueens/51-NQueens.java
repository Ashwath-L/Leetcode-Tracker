// Last updated: 7/9/2026, 3:10:44 PM
class Solution {
    List<List<String>> a = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        char[][] b = new char[n][n];

        for (int i = 0; i < n; i++) {
            Arrays.fill(b[i], '.');
        }

        c(b, 0);
        return a;
    }

    void c(char[][] b, int d) {
        if (d == b.length) {
            List<String> e = new ArrayList<>();
            for (char[] f : b) {
                e.add(new String(f));
            }
            a.add(e);
            return;
        }

        for (int i = 0; i < b.length; i++) {
            if (g(b, d, i)) {
                b[d][i] = 'Q';
                c(b, d + 1);
                b[d][i] = '.';
            }
        }
    }

    boolean g(char[][] b, int c, int d) {
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