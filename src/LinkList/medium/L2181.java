package LinkList.medium;

import LinkList.ListNode;

//合并0之间的节点
public class L2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode cur=head;
        ListNode start=cur;
        while (cur!=null){
            if(cur.val==0){
                cur=cur.next;
                continue;
            }
            start=cur;
            cur=cur.next;
            while (cur.val!=0){
                start.val=cur.val+start.val;
                cur=cur.next;
            }
            start.next=cur.next;
        }
        return head.next;
    }
}
