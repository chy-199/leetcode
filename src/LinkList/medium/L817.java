package LinkList.medium;

import LinkList.ListNode;

import java.util.Arrays;
import java.util.HashSet;

//链表组件
public class L817 {
    public int numComponents(ListNode head, int[] nums) {
        ListNode cur=head;
        int i=0;
        int ans=0;
        ListNode before=cur;
        HashSet<Integer> flag=new HashSet<>();
        for(i=0;i<nums.length;i++){
            flag.add(nums[i]);
        }
        while (cur!=null){
            if(flag.contains(cur.val)) {
                while (cur != null && flag.contains(cur.val)) {
                    cur = cur.next;
                }
                ans++;
            }
            if(cur==null)break;
            cur=cur.next;
        }
        return ans;
    }
}
