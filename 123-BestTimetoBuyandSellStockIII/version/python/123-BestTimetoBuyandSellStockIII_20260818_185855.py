# Last updated: 8/18/2026, 6:58:55 PM
1class Solution:
2
3    def __init__(self):
4        self.maxSum = float('-inf')
5
6    def maxPathSum(self, root):
7
8        def findMax(node):
9
10            if not node:
11                return 0
12
13            left = max(0, findMax(node.left))
14            right = max(0, findMax(node.right))
15
16            # Complete path through current node
17            currentPath = left + node.val + right
18
19            self.maxSum = max(self.maxSum, currentPath)
20
21            # Return only one branch to parent
22            return node.val + max(left, right)
23
24        findMax(root)
25
26        return self.maxSum