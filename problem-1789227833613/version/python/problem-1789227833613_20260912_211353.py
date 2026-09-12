# Last updated: 9/12/2026, 9:13:53 PM
1class Solution:
2    def countSpecialIntegers(self, nums: list[int]) -> int:
3        d = {}
4        for i, x in enumerate(nums):
5            d.setdefault(x, []).append(i)
6        c = 0
7        for k, v in d.items():
8            if len(v) == 3 and v[1] - v[0] == v[2] - v[1]:
9                c += 1
10        return c