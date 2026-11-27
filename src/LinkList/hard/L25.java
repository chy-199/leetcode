package LinkList.hard;

import LinkList.ListNode;

//k个一组反转链表
public class L25 {
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur=head;
        int count=1;
        ListNode dummy=new ListNode(-1,cur);
        ListNode pre=cur;
        ListNode flag=dummy;
        ListNode next=cur.next;
        while (cur!=null){
            while (cur!=null&&count%k!=0){
                cur=cur.next;
                count++;
            }
            if(cur==null)break;
            next=cur.next;
            ListNode temp=pre;
            cur.next=null;
            ListNode done=reverseLinkList(pre);
            flag.next=done;
            temp.next=next;
            flag=pre;
            cur=next;
            pre=cur;
            count=1;
        }
        return dummy.next;
    }
    public ListNode reverseLinkList(ListNode head){
        ListNode cur=head;
        ListNode pre=null;
        ListNode next=cur.next;
        while (cur!=null){
            next=cur.next;
            cur.next=pre;
            pre=cur;
            cur=next;
        }
        return pre;
    }
}
