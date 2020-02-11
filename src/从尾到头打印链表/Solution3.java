package 从尾到头打印链表;

import java.util.ArrayList;
import java.util.Stack;

public class Solution3 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode){
        Stack<Integer> stack = new Stack<>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()){
            res.add(stack.pop());
        }
        return res;
    }
}
