# Last updated: 9/27/2026, 3:41:10 PM
1from bisect import bisect_left, insort
2
3class Solution:
4    def containsNearbyAlmostDuplicate(self, nums, indexDiff, valueDiff):
5        a = []
6
7        for i in range(len(nums)):
8            if i > indexDiff:
9                a.remove(nums[i - indexDiff - 1])
10
11            j = bisect_left(a, nums[i])
12
13            if j < len(a) and abs(a[j] - nums[i]) <= valueDiff:
14                return True
15
16            if j > 0 and abs(a[j - 1] - nums[i]) <= valueDiff:
17                return True
18
19            insort(a, nums[i])
20
21        return False