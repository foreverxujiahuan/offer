package 二叉树的镜像;


import java.util.Stack;

public class Solution {
    public static void Mirror(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<TreeNode>();
        stack.push(root);
        while (!stack.empty()){
            TreeNode node = stack.pop();
            if(node.right!=null||node.left!=null){
                TreeNode L = node.left;
                TreeNode R = node.right;
                node.left = R;
                node.right = L;
            }
            if(node.left!=null){
                stack.push(node.left);
            }
            if(node.right!=null){
                stack.push(node.right);
            }
        }
    }
}
