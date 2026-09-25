# Last updated: 9/25/2026, 5:50:43 PM
1class Solution:
2    def wordBreak(self, s, wordDict):
3        a = set(wordDict)
4        b = {}
5
6        def f(s):
7            if s in b:
8                return b[s]
9
10            if not s:
11                return [""]
12
13            c = []
14
15            for i in range(1, len(s) + 1):
16                x = s[:i]
17
18                if x in a:
19                    for y in f(s[i:]):
20                        if y:
21                            c.append(x + " " + y)
22                        else:
23                            c.append(x)
24
25            b[s] = c
26            return c
27
28        return f(s)