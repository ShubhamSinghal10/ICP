
class ListNode {    
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class Solution {    
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return null;
        ListNode a = head;
        ListNode b = head;
        while(b!=null){
            if(a.val==b.val) b=b.next;
            else {
                a.next=b;
                a=b;
            }
        }

        a.next=b;
        return head;
    }
}
