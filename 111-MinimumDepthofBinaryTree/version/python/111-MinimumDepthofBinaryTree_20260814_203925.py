# Last updated: 8/14/2026, 8:39:25 PM
1class Solution:
2    def minDepth(self, root):
3        if not root:
4            return 0
5        if not root.left:
6            return 1 + self.minDepth(root.right)
7        if not root.right:
8            return 1 + self.minDepth(root.left)
9        return 1 + min(self.minDepth(root.left), self.minDepth(root.right))