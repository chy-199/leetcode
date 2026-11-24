package LinkList.medium;

import LinkList.ListNode;

//在链表中插入最大公约数
public class L2807 {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode cur=head;
        ListNode pre=cur;
        cur=cur.next;
        while (cur!=null){
            int val=gcd(pre.val,cur.val);
            ListNode in=new ListNode(val,cur);
            pre.next=in;
            pre=cur;
            cur=cur.next;
        }
        return head;
    }
    public int gcd(int a,int b){
        int min=Math.min(a,b);
        int max=Math.max(a,b);
        int r=max%min;
        if(r==0)return min;
        else{
            return gcd(min,r);
        }
    }
}
