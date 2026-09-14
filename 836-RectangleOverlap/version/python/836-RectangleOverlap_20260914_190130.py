# Last updated: 9/14/2026, 7:01:30 PM
1class Solution:
2    def isRectangleOverlap(self, rec1, rec2):
3        left = max(rec1[0], rec2[0])
4        right = min(rec1[2], rec2[2])
5
6        bottom = max(rec1[1], rec2[1])
7        top = min(rec1[3], rec2[3])
8
9        return left < right and bottom < top