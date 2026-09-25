# Last updated: 9/25/2026, 6:08:40 PM
1class Solution:
2    def sortedArrayToBST(self, nums):
3        if not nums:
4            return None
5
6        a = len(nums) // 2
7
8        b = TreeNode(nums[a])
9        b.left = self.sortedArrayToBST(nums[:a])
10        b.right = self.sortedArrayToBST(nums[a + 1:])
11
12        return b