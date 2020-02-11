package 用两个栈实现队列;

import java.util.Stack;

public class Solution2 {
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();
    public void push(int node){
        stack2.push(node);
    }
    public int pop(){
        int res;
        if(!stack1.isEmpty()){
            res = stack1.pop();
        }else {
            while (!stack2.isEmpty()){
                stack1.push(stack2.pop());
            }
            res = stack1.pop();
        }
        return res;
    }
}
