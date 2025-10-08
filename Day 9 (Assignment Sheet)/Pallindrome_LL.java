

class Solution {
    ListNode reverseLL(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast!=null&&fast.next!=null) {
            slow = slow.next;
            fast=fast.next.next;
        }
        ListNode t = reverseLL(slow);
        ListNode temp = head;
        while(t!=null) {
            if(t.val!=temp.val) return false;
            t=t.next;
            temp=temp.next;
        }
        return true;
    }
}
