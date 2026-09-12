# Last updated: 9/12/2026, 9:19:20 PM
1class Solution:
2    def countSpecialIntegers(self, nums: list[int]) -> int:
3        d = {}
4        for i, x in enumerate(nums):
5            d.setdefault(x, []).append(i)
6
7        c = 0
8        for k, v in d.items():
9            if len(v) < 3:
10                continue
11            gap = v[1] - v[0]
12            if all(v[j] - v[j - 1] == gap for j in range(2, len(v))):
13                c += 1
14        return c