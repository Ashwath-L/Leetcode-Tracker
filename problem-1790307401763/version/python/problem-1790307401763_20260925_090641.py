# Last updated: 9/25/2026, 9:06:41 AM
1class Solution:
2    def braceExpansionII(self, expression: str) -> list[str]:
3        self.i = 0
4        self.expr = expression
5        res = self.parse()
6        return sorted(res)
7    def parse(self):
8        res = set()
9        cur = {""}
10        while self.i < len(self.expr) and self.expr[self.i] != '}':
11            if self.expr[self.i] == '{':
12                self.i += 1
13                nxt = self.parse()
14                self.i += 1
15                cur = self.product(cur, nxt)
16            elif self.expr[self.i] == ',':
17                res |= cur
18                cur = {""}
19                self.i += 1
20            else:
21                nxt = {self.expr[self.i]}
22                self.i += 1
23                cur = self.product(cur, nxt)
24        res |= cur
25        return res
26    def product(self, a, b):
27        return {x + y for x in a for y in b}