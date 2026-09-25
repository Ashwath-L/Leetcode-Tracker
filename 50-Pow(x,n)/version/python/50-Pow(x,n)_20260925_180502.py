# Last updated: 9/25/2026, 6:05:02 PM
1class Solution:
2    def myPow(self, x, n):
3        if n < 0:
4            x = 1 / x
5            n = -n
6
7        a = 1
8
9        while n:
10            if n % 2:
11                a *= x
12
13            x *= x
14            n //= 2
15
16        return a