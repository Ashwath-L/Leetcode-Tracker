# Last updated: 10/1/2026, 4:11:40 PM
1class Solution:
2    def spiralMatrixIII(self, rows: int, cols: int, rStart: int, cStart: int) -> List[List[int]]:
3        result = []
4        directions = [(0, 1), (1, 0), (0, -1), (-1, 0)]
5        steps = 1
6        d = 0
7        r, c = rStart, cStart
8        result.append([r, c])
9
10        while len(result) < rows * cols:
11            for _ in range(2):
12                for _ in range(steps):
13                    r += directions[d][0]
14                    c += directions[d][1]
15                    if 0 <= r < rows and 0 <= c < cols:
16                        result.append([r, c])
17                d = (d + 1) % 4
18            steps += 1
19
20        return result