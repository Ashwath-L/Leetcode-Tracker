# Last updated: 8/6/2026, 7:12:42 PM
1class Solution(object):
2    def smallestNumber(self, n, t):
3        for i in range(n,101):
4            b=list(map(int,str(i)))
5            c=1
6            for j in b:
7                c*=j
8            if(c%t==0):
9                return i
10                