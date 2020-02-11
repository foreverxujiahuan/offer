package 从上往下打印二叉树;


import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        ArrayList t = new ArrayList();
        if(root==null){
            return t;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        ((LinkedList<TreeNode>) deque).add(root);
        while (!deque.isEmpty()){
            TreeNode node = deque.pop();
            t.add(node.val);
            if(node.left!=null){
                ((LinkedList<TreeNode>) deque).add(node.left);
            }
            if(node.right!=null){
                ((LinkedList<TreeNode>) deque).add(node.right);
            }
        }
        return t;
    }
}
