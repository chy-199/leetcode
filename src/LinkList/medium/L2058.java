package LinkList.medium;
import LinkList.ListNode;
//找出临界点之间的最小和最大距离
public class L2058 {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode cur=head;
        int[] ans=new int[2];
        int max=-1;
        int min=100000;
        int node=0;
        int spot=0;
        int end=0;
        int first=0;
        ListNode before=cur;
        cur=cur.next;
        ListNode after=cur.next;
        while (after!=null){
            if((cur.val>before.val&&cur.val>after.val)||(cur.val<before.val&&cur.val<after.val)){
                node++;
                if(node>1){
                    max=Math.max(max,end-first);
                    min=Math.min(min,end-spot);
                }
                if(node==1){
                    first=end;
                }
                spot=end;
            }
            before=cur;
            cur=cur.next;
            if(cur==null)break;
            after=cur.next;
            end++;
        }
        if(node<2)min=-1;
        ans[0]=min;
        ans[1]=max;
        return ans;
    }
}
