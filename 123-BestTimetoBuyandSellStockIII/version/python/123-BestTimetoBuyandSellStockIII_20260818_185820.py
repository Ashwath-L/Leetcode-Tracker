# Last updated: 8/18/2026, 6:58:20 PM
1class Solution:
2    def maxProfit(self, prices: List[int]) -> int:        
3        buy1 = -prices[0]
4        sell1 = 0
5        buy2 = -prices[0]
6        sell2 = 0
7
8        for i in range(1, len(prices)):
9            price = prices[i]
10
11            buy1 = max(buy1, -price)
12            sell1 = max(sell1, buy1 + price)
13            buy2 = max(buy2, sell1 - price)
14            sell2 = max(sell2, buy2 + price)
15        
16        return sell2