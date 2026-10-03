# Last updated: 10/3/2026, 10:01:42 AM
1class Solution:
2    def longestValidParentheses(self, s: str) -> int:
3        st = [-1]
4        res = 0
5
6        for i, ch in enumerate(s):
7            if ch == '(':
8                st.append(i)
9            else:
10                st.pop()
11                if not st:
12                    st.append(i)
13                else:
14                    res = max(res, i - st[-1])
15
16        return res