package 对称的二叉树;


import java.util.Stack;

public class Solution {
    public static boolean isSymmetrical(TreeNode pRoot){
        TreeNode node = getMirror(pRoot);
        return f(node,pRoot);
    }
    private static TreeNode getMirror(TreeNode pRoot){
        if (pRoot == null) {
            return null;
        }
        TreeNode root = new TreeNode(pRoot.val);
        root.right = getMirror(pRoot.left);
        root.left = getMirror(pRoot.right);
        return root;
    }
    private static boolean f(TreeNode left,TreeNode right){
        if(left==null&&right==null){
            return true;
        }else if(left==null||right==null){
            return false;
        }else if(left.val!=right.val){
            return false;
        }
        else {
            return f(left.left,right.left)&&f(left.right,right.right);
        }
    }
}
