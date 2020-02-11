package 二叉树的镜像;

import java.util.Stack;

public class Solution2 {
    public void Mirror(TreeNode root){
        if(root==null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node.left!=null||node.right!=null){
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
