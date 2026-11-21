package LinkList.easy;

import LinkList.ListNode;

//删除排序链表中的重复元素
public class L83 {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur=head;
        ListNode pre=cur;
        if(cur==null)return head;
        cur=cur.next;
        while (cur!=null){
            while (cur!=null&&cur.val==pre.val){
                cur=cur.next;
            }
            pre.next=cur;
            pre=cur;
            if(cur==null)break;
            cur=cur.next;
        }
        return head;
    }
}
