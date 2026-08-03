# Last updated: 8/3/2026, 8:12:37 PM
1class Solution:
2    def stoneGameIII(self, stoneValue):
3        n = len(stoneValue)
4        dp = [0] * (n + 1)
5
6        for i in range(n - 1, -1, -1):
7            t = 0
8            dp[i] = float('-inf')
9
10            for j in range(3):
11                if i + j < n:
12                    t += stoneValue[i + j]
13                    dp[i] = max(dp[i], t - dp[i + j + 1])
14
15        if dp[0] > 0:
16            return "Alice"
17        elif dp[0] < 0:
18            return "Bob"
19        return "Tie"