# Last updated: 10/9/2026, 9:52:21 AM
1class Solution(object):
2    def minInsertions(self, s):
3        st = []
4        res = 0
5        i = 0
6
7        while i < len(s):
8            ch = s[i]
9
10            if ch == '(':
11                st.append(ch)
12            else:
13                if not st:
14                    if i < len(s) - 1 and s[i + 1] == ')':
15                        i += 1
16                    else:
17                        res += 1
18                    res += 1
19                else:
20                    if i < len(s) - 1 and s[i + 1] == ')':
21                        i += 1
22                    else:
23                        res += 1
24                    st.pop()
25
26            i += 1
27
28        return res + len(st) * 2