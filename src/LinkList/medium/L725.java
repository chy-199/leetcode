package LinkList.medium;

import LinkList.ListNode;

//分隔链表
public class L725 {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode cur=head;
        ListNode[] ans=new ListNode[k];
        int total=0;
        int i=0;
        while (cur!=null){
            cur=cur.next;
            total++;
        }
        int x=total/k;
        int y=total%k;
        cur=head;
        while (cur!=null){
            int n=0;
            ListNode start=cur;
            while (cur!=null&&n<x-1){
                n++;
                cur=cur.next;
            }
            if(i<y&&x>0){
                cur=cur.next;
            }
            if(cur==null)break;
            ListNode temp=cur.next;
            cur.next=null;
            ans[i]=start;
            i++;
            cur=temp;
        }
        return ans;
    }
}
