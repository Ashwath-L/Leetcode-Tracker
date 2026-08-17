# Last updated: 8/17/2026, 9:52:11 PM
1class Solution:
2    def stoneGameV(self, stoneValue: List[int]) -> int:
3        n = len(stoneValue)
4
5        prefix = [0] * (n + 1)
6
7        for i in range(1, n + 1):
8            prefix[i] = prefix[i - 1] + stoneValue[i - 1]
9
10        def search(left_bound: int, right_bound: int) -> int:
11            total = prefix[right_bound + 1] - prefix[left_bound]
12            start = left_bound
13
14            left = left_bound
15            right = right_bound
16
17            while left < right:
18                mid = left + (right - left) // 2
19                left_sum = prefix[mid + 1] - prefix[start]
20
21                if left_sum * 2 >= total:
22                    right = mid
23                else:
24                    left = mid + 1
25
26            return left
27
28        dp = [[0] * n for _ in range(n)]
29        left = [[0] * n for _ in range(n)]
30        right = [[0] * n for _ in range(n)]
31
32        for i in range(n):
33            left[i][i] = stoneValue[i]
34            right[i][i] = stoneValue[i]
35
36        for length in range(1, n):
37            for i in range(n - length):
38                j = i + length
39
40                k = search(i, j)
41
42                total = prefix[j + 1] - prefix[i]
43                left_half = prefix[k + 1] - prefix[i]
44
45                if left_half * 2 == total:
46                    dp[i][j] = max(
47                        left[i][k],
48                        right[k + 1][j]
49                    )
50                else:
51                    left_best = 0 if k == i else left[i][k - 1]
52                    right_best = 0 if k == j else right[k + 1][j]
53
54                    dp[i][j] = max(
55                        left_best,
56                        right_best
57                    )
58
59                left[i][j] = max(
60                    left[i][j - 1],
61                    total + dp[i][j]
62                )
63
64                right[i][j] = max(
65                    right[i + 1][j],
66                    total + dp[i][j]
67                )
68
69        return dp[0][n - 1]