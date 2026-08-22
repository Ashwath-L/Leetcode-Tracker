# Last updated: 8/22/2026, 9:21:51 AM
1class Solution(object):
2    def checkDivisibility(self, n):
3        a=list(map(int,str(n)))
4        m=1
5        s=0
6        for i in a:
7            m*=i
8            s+=i
9        if(n%(m+s)==0):
10            return True
11        else:
12            return False
13        