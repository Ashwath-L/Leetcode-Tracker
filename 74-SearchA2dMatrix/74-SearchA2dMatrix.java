// Last updated: 7/9/2026, 3:10:23 PM
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int l = 0;
        int r = rows * cols - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int re = matrix[row][col];
            if (re == target) {
                return true;
            } else if (re < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return false;
    }
}