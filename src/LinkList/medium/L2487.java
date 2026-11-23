package LinkList.medium;

import LinkList.ListNode;

//从链表中移除节点
public class L2487 {
    public ListNode removeNodes(ListNode head) {
        head=reverse(head);
        ListNode cur=head.next;
        ListNode target=head;
        while (cur!=null){
            while (cur!=null&&cur.val<target.val){
                cur=cur.next;
            }
            target.next=cur;
            if(cur==null)break;
            target=cur;
            cur=cur.next;
        }

        return reverse(head);
    }
    public ListNode reverse(ListNode head){
        ListNode pre=null;
        ListNode target=head;
    while (target!=null){
         ListNode after=target.next;
         target.next=pre;
         pre=target;
         target=after;
    }
    return pre;
    }
}
