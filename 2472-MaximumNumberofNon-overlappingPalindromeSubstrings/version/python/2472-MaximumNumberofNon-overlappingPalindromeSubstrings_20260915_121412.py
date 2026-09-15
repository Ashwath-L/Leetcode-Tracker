# Last updated: 9/15/2026, 12:14:12 PM
1class Solution:
2    def maxPalindromes(self, s, k):
3        n = len(s)
4        ans = 0
5        end = -1
6
7        for i in range(n):
8            for l0 in (i - 1, i):
9                l, r = l0, i
10                while l >= 0 and r < n and s[l] == s[r]:
11                    if r - l + 1 >= k and l > end:
12                        ans += 1
13                        end = r
14                        break
15
16                    l -= 1
17                    r += 1
18
19        return ans