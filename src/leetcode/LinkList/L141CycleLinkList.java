package leetcode.LinkList;

public class L141CycleLinkList {
    class ListNode{
        int val;
        ListNode next;
    }
    public boolean hasCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null||head.next==null)return false;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast.val==slow.val)return true;
        }
        return false;
    }
}
