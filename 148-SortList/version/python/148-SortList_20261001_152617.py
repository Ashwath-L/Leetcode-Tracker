# Last updated: 10/1/2026, 3:26:17 PM
1class Solution:
2    def sortList(self, head: Optional[ListNode]) -> Optional[ListNode]:
3        if not head or not head.next:
4            return head
5        slow, fast = head, head.next
6        while fast and fast.next:
7            slow = slow.next
8            fast = fast.next.next
9        mid = slow.next
10        slow.next = None
11        left = self.sortList(head)
12        right = self.sortList(mid)
13        dummy = ListNode(0)
14        curr = dummy
15        while left and right:
16            if left.val < right.val:
17                curr.next = left
18                left = left.next
19            else:
20                curr.next = right
21                right = right.next
22            curr = curr.next
23        curr.next = left or right
24
25        return dummy.next