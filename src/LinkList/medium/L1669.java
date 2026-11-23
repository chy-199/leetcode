package LinkList.medium;

import LinkList.ListNode;

import java.util.HexFormat;

//合并两个链表
public class L1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode cur= list1;
        int i=1;
        ListNode A=null;
        ListNode B=null;
        while (cur!=null){
            if(i==a){
                A=cur;
            }
            if(i==b+2){
                B=cur;
                break;
            }
            cur=cur.next;
            i++;
        }
        cur=list2;
        A.next=cur;
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=B;
        return list1;
    }
}
