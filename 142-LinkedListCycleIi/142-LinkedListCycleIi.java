// Last updated: 7/9/2026, 3:09:55 PM
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        boolean isCycle = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                isCycle = true;
                break;
            }
        }
        if (!isCycle) {
            return null;
        }

        while (head != slow) {
            head = head.next;
            slow = slow.next;
        }
        return head;
    }

}