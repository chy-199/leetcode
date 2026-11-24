package LinkList.medium;

import LinkList.ListNode;

//对链表进行插入排序
public class L147 {
    public ListNode insertionSortList(ListNode head) {
        ListNode dummy=new ListNode(-1,null);
        ListNode cur=head;
        while (cur!=null){
            ListNode temp=dummy;
            ListNode pre=dummy;
            while (temp!=null&&cur.val>temp.val){
                pre=temp;
                temp=temp.next;
            }
            ListNode t=cur.next;
            pre.next=cur;
            cur.next=temp;
            cur=t;
        }
        return dummy.next;
    }
}
