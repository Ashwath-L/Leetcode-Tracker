# Last updated: 9/25/2026, 5:58:50 PM
1class Solution:
2    def swapPairs(self, head):
3        a = ListNode(0)
4        a.next = head
5        b = a
6
7        while b.next and b.next.next:
8            c = b.next
9            d = c.next
10
11            c.next = d.next
12            d.next = c
13            b.next = d
14
15            b = c
16
17        return a.next