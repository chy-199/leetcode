package LinkList.medium;

import LinkList.ListNode;

//删除排序链表中的重复元素II
public class L83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        ListNode dummy=new ListNode(-999,head);
        ListNode pre=dummy;
        ListNode temp=pre;
        while (cur!=null){
            while ((cur!=null&&cur.val==pre.val)||(cur!=null&&temp.val==cur.val)){
                cur=cur.next;
            }
            if(cur!=null&&cur.next!=null){
                if(cur.val==cur.next.val){
                    temp=cur;
                    continue;
                }
            }
            pre.next=cur;
            pre=cur;
            if(cur==null)break;
            cur=cur.next;
        }
        if(dummy.next==null)return dummy;
        return dummy.next;
    }
}
