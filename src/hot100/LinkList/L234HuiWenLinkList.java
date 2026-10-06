package hot100.LinkList;
public class L234HuiWenLinkList {
    class ListNode{
        int val;
        ListNode next;
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

    public boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while (fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        fast=reverseList(slow);
        slow=head;
        while(fast!=null&&fast.next!=null){
            if(fast.val!=slow.val)return false;
            fast=fast.next;
            slow=slow.next;
        }
        return true;
    }
}

