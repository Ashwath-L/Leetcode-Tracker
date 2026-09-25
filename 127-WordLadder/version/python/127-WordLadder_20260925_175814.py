# Last updated: 9/25/2026, 5:58:14 PM
1class Solution:
2    def removeNthFromEnd(self, head, n):
3        a = ListNode(0)
4        a.next = head
5
6        b = a
7        c = a
8
9        for i in range(n):
10            b = b.next
11
12        while b.next:
13            b = b.next
14            c = c.next
15
16        c.next = c.next.next
17
18        return a.next