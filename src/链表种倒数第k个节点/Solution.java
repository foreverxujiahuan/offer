package 链表种倒数第k个节点;

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k){
        ListNode phead = head;
        int l =0;
        while (phead!=null){
            phead= phead.next;
            l++;
        }
        if(l==0||k>l){
            return null;
        }
        int n = l-k;
        ListNode phead2 = head;
        while (n!=0){
            phead2=phead2.next;
            n--;
            if(n==0){
                return phead2;
            }
        }
        return head;
    }
}
