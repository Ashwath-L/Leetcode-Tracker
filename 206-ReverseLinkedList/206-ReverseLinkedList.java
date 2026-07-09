// Last updated: 7/9/2026, 3:09:10 PM
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next=pre;
            pre=curr;
            curr=next;
        }
        return pre;
    }
}