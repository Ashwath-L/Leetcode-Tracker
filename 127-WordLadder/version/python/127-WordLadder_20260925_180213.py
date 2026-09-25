# Last updated: 9/25/2026, 6:02:13 PM
1class Solution:
2    def multiply(self, num1, num2):
3        if num1 == "0" or num2 == "0":
4            return "0"
5
6        a = [0] * (len(num1) + len(num2))
7
8        for i in range(len(num1) - 1, -1, -1):
9            for j in range(len(num2) - 1, -1, -1):
10                x = int(num1[i]) * int(num2[j])
11
12                c = i + j + 1
13                d = x + a[c]
14
15                a[c] = d % 10
16                a[c - 1] += d // 10
17
18        return "".join(map(str, a)).lstrip("0")