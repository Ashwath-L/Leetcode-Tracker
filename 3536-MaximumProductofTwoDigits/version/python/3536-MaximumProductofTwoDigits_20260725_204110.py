# Last updated: 7/25/2026, 8:41:10 PM
1class Solution(object):
2    def maxProduct(self, n):
3        a=list(map(int,str(n)))
4        b=max(a)
5        a.remove(b)
6        c=max(a)
7        return b*c