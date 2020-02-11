package 删除链表中重复的节点;

public class Solution {
    public static ListNode deleteDuplivation(ListNode pHead){
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        while (pHead!=null){
            if(pHead.next==null||pHead.val!=pHead.next.val){
                p.next = new ListNode(pHead.val);
                p = p.next;
                pHead = pHead.next;
            }else{
                while (pHead.next!=null&&pHead.val==pHead.next.val){
                    pHead = pHead.next;
                }
                pHead = pHead.next;
            }
        }
        return dummy.next;
    }
}
