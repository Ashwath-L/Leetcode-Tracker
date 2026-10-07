# Last updated: 10/7/2026, 6:37:32 PM
1class Solution:
2    def removeInvalidParentheses(self, s):
3        n = len(s)
4        memo = [[None] * (n + 1) for _ in range(n + 1)]
5
6        valid = self.dfs(s, 0, 0, memo)
7
8        max_len = max(len(x) for x in valid)
9
10        return [x for x in valid if len(x) == max_len]
11
12    def dfs(self, s, i, open_count, memo):
13        if open_count < 0:
14            return set()
15
16        if memo[i][open_count] is not None:
17            return memo[i][open_count]
18
19        if i == len(s):
20            if open_count == 0:
21                return {""}
22            return set()
23
24        c = s[i]
25        ans = set()
26
27        if c == '(' or c == ')':
28            ans.update(self.dfs(s, i + 1, open_count, memo))
29
30        next_open = open_count
31
32        if c == '(':
33            next_open += 1
34        elif c == ')':
35            next_open -= 1
36
37        for suffix in self.dfs(s, i + 1, next_open, memo):
38            ans.add(c + suffix)
39
40        memo[i][open_count] = ans
41        return ans