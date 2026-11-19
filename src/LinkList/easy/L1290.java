package LinkList.easy;
import LinkList.ListNode;
//二进制链表转整数
public class L1290 {
    public int getDecimalValue(ListNode head) {
        int i=0;
        int ans=0;
        ListNode cur=head;
        while (cur!=null){
            ans=ans*2+cur.val*2;
            cur=cur.next;
        }
        ans=ans/2-1;
        return ans;
    }
}
