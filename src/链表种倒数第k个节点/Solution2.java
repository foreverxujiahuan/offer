package 链表种倒数第k个节点;

import java.util.Stack;

public class Solution2 {
    public static void main(String[] args){
        System.out.println("hello");
    }
    public static ListNode FindKthToTail(ListNode head,int k){
        Stack<ListNode> stack = new Stack<>();
        if(head==null||k==0){
            return null;
        }
        int l = 0;
        while (head!=null){
            stack.push(head);
            head = head.next;
            l = l+1;
        }
        if(k>l){
            return null;
        }
        ListNode res = new ListNode(0);
        while (k>0&&!stack.isEmpty()){
            k--;
            res = stack.pop();
        }
        return res;
    }
}
