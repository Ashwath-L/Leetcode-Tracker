# Last updated: 8/18/2026, 6:37:24 PM
1class Solution:
2    def largestInteger(self, nums: List[int], k: int) -> int:
3        count = {}
4        for i in range(len(nums) - k + 1):
5            seen = set()
6
7            for j in range(i, i + k):
8                seen.add(nums[j])
9            for x in seen:
10                count[x] = count.get(x, 0) + 1
11
12        ans = -1
13        for x in count:
14            if count[x] == 1:
15                ans = max(ans, x)
16
17        return ans