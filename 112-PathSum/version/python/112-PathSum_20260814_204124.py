# Last updated: 8/14/2026, 8:41:24 PM
1class Solution:
2    def maxProfit(self, prices):
3        low = prices[0]
4        profit = 0
5        for p in prices:
6            low = min(low, p)
7            profit = max(profit, p - low)
8        return profit