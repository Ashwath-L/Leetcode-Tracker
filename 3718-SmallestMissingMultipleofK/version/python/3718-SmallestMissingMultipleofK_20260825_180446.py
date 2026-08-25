# Last updated: 8/25/2026, 6:04:46 PM
1class Solution:
2    def missingMultiple(self, nums: List[int], k: int) -> int:
3        smallest = 1
4        multiple_of_k = set()
5
6        for num in nums:
7            if num % k == 0:
8                multiple_of_k.add(num // k)
9
10            if num // k == smallest:
11                while smallest in multiple_of_k:
12                    smallest += 1
13
14        return smallest * k