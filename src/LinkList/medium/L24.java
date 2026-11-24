package LinkList.medium;

import LinkList.ListNode;

//两两交换链表中的节点
public class L24 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1,head);
        ListNode cur=head;
        ListNode pre=dummy;
        int count=1;
        ListNode record=dummy;
        while (cur!=null){
            ListNode next=cur.next;
            if(count%2==0){
                record.next=cur;
                record=pre;
                cur.next=pre;
                pre.next=next;
            }
            pre=cur;
            cur=next;
            count++;
        }
        return dummy.next;
    }
}
