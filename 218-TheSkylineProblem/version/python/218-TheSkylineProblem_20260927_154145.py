# Last updated: 9/27/2026, 3:41:45 PM
1class Solution:
2    def countDigitOne(self, n):
3        a = 0
4        b = 1
5
6        while b <= n:
7            c = n // b
8            d = n % b
9
10            a += (c + 8) // 10 * b
11
12            if c % 10 == 1:
13                a += d + 1
14
15            b *= 10
16
17        return a