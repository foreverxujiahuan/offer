package 栈的压入弹出序列;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static boolean IsPopOrder(int[] pushA,int[] popA){
        if(pushA.length==0||pushA.length!=popA.length){
            return false;
        }
        int l = pushA.length;
        List<Integer> pop_A = new ArrayList<>();
        for(int i=0;i<popA.length;i++){
            pop_A.add(popA[i]);
        }
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<l;i++){
            int t = pushA[i];
            stack.push(t);
            while (!stack.isEmpty()&&stack.peek()==pop_A.get(0)){
                stack.pop();
                pop_A.remove(0);
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
}
