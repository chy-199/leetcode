package LinkList.medium;

import LinkList.ListNode;

//删除节点
public class L237 {
    public void deleteNode(ListNode node) {
        ListNode cur=node;
        cur=cur.next;
        node.val=cur.val;
        node.next=cur.next;
    }
}
