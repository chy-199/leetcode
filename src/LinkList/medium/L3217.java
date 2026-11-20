package LinkList.medium;

import LinkList.ListNode;

import java.util.HashSet;

//从链表中移除在数组中存在的节点
public class L3217 {
    public ListNode modifiedList(int[] nums, ListNode head) {
        ListNode cur=head;
        ListNode dummy=new ListNode(1,head);
        ListNode before=dummy;
        HashSet<Integer> flag=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            flag.add(nums[i]);
        }
        while (cur!=null){
            while (cur!=null&&flag.contains(cur.val)){
                cur=cur.next;
            }
            before.next=cur;
            before=cur;
            if(cur==null)break;
            cur=cur.next;
        }
        return dummy.next;
    }
}
