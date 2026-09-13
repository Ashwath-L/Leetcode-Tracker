# Last updated: 9/13/2026, 11:55:34 AM
1class Solution:
2    def largestOverlap(self, A: List[List[int]], B: List[List[int]]) -> int:
3        dim = len(A)
4        def shift_and_count(x_shift, y_shift, M, R):
5            left_shift_count, right_shift_count = 0, 0
6            for r_row, m_row in enumerate(range(y_shift, dim)):
7                for r_col, m_col in enumerate(range(x_shift, dim)):
8                    if M[m_row][m_col] == 1 and M[m_row][m_col] == R[r_row][r_col]:
9                        left_shift_count += 1
10                    if M[m_row][r_col] == 1 and M[m_row][r_col] == R[r_row][m_col]:
11                        right_shift_count += 1
12            return max(left_shift_count, right_shift_count)
13        max_overlaps = 0
14        for y_shift in range(0, dim):
15            for x_shift in range(0, dim):
16                max_overlaps = max(max_overlaps, shift_and_count(x_shift, y_shift, A, B))
17                max_overlaps = max(max_overlaps, shift_and_count(x_shift, y_shift, B, A))
18        return max_overlaps