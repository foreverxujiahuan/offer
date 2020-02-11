package 包含min函数的栈;

import java.util.Iterator;
import java.util.Stack;

public class Solution {
    Stack<Integer> stack=new Stack<Integer>();
    public void push(int node){

        stack.push(node);
    }
    public void pop()
    {
        stack.pop();
    }
    public int top()
    {
        return stack.peek();
    }
    public int min(){
        Iterator<Integer> temp = stack.iterator();
        int min = stack.peek();
        while (temp.hasNext()){
            int t = temp.next();
            if(t<min){
                min = t;
            }
        }
        return min;
    }
}
