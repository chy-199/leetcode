package LinkList.easy;

import LinkList.ListNode;

//移除链表元素
public class L203 {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)return head;
        ListNode dummy=new ListNode(1,head);
        ListNode cur=head;
        ListNode before=dummy;
        while (cur!=null){
            while (cur!=null&&cur.val==val){
                cur=cur.next;
            }
            before.next=cur;
            before=cur;
            if(cur==null)break;
            cur=cur.next;
        }
        return dummy.next;
    }
}
