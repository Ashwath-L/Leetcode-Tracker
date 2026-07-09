// Last updated: 7/9/2026, 3:09:01 PM
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode curr = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            curr = curr.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        while (prev != null && head != null) {
            if (prev.val != head.val) {
                return false;
            }
            prev = prev.next;
            head = head.next;
        }
        return true;
    }
}