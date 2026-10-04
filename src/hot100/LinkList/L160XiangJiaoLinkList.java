package leetcode.LinkList;

public class L160XiangJiaoLinkList {
   public class ListNode{
       int val;
       ListNode next;
       ListNode(int num){
           val=num;
           next=null;
       }
   }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int i=0;
        int j=0;
        ListNode a=headA;
        ListNode b=headB;
        while (a!=null){
            a=a.next;
            i++;
        }
        while (b!=null){
            b=b.next;
            j++;
        }
        if(i<=j){
            a=headB;
            b=headA;
        }
        else {
            a=headA;
            b=headB;
        }
        int count=0;
        while (count<Math.abs(i-j)){
            a=a.next;
            count++;
        }
        while (a!=null&&b!=null){
            if(a==b)return a;
            a=a.next;
            b=b.next;
        }
        return null;
    }
}
