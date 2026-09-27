# Last updated: 9/27/2026, 3:42:16 PM
1from collections import deque
2
3class Solution:
4    def maxSlidingWindow(self, nums, k):
5        a = deque()
6        ans = []
7
8        for i in range(len(nums)):
9            while a and a[0] <= i - k:
10                a.popleft()
11
12            while a and nums[a[-1]] <= nums[i]:
13                a.pop()
14
15            a.append(i)
16
17            if i >= k - 1:
18                ans.append(nums[a[0]])
19
20        return ans