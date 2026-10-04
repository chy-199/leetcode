package leetcode.LinkList;
public class L206ReverseLinkList {
    class ListNode{
        public int val;
        public ListNode next;
        ListNode(int num){
            val=num;
        }
    }
    public ListNode reverseList(ListNode head) {
        //头插法 迭代
        ListNode front=new ListNode(0);
        ListNode temp;
        front.next=null;
        while (head!=null){
            temp=front.next;
            ListNode cur=head;
            head=head.next;
            front.next=cur;
            cur.next=temp;
        }
        head=front.next;
           return head;
    }
}
