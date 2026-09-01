# Last updated: 9/1/2026, 11:56:34 AM
1class Solution:
2    def threeSumClosest(self, nums: List[int], target: int) -> int:
3        nums.sort()
4        result = nums[0] + nums[1] + nums[2]
5
6        for i in range(len(nums) - 2):
7            left, right = i + 1, len(nums) - 1
8
9            while left < right:
10                total = nums[i] + nums[left] + nums[right]
11
12                if abs(target - total) < abs(target - result):
13                    result = total
14
15                if total == target:
16                    return target
17                elif total < target:
18                    left += 1
19                else:
20                    right -= 1
21
22        return result