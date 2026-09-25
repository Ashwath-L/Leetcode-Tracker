# Last updated: 9/25/2026, 6:09:06 PM
1class Solution:
2    def getIntersectionNode(self, headA, headB):
3        a = headA
4        b = headB
5
6        while a != b:
7            if a:
8                a = a.next
9            else:
10                a = headB
11
12            if b:
13                b = b.next
14            else:
15                b = headA
16
17        return a