# Last updated: 8/1/2026, 9:30:44 AM
1class Solution:
2    def predictTheWinner(self, nums):
3        n = len(nums)
4        dp = nums[:]
5
6        for l in range(n - 2, -1, -1):
7            for r in range(l + 1, n):
8                dp[r] = max(nums[l] - dp[r], nums[r] - dp[r - 1])
9
10        return dp[-1] >= 0