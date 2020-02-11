package 平衡二叉树;

public class Solution {
    public boolean IsBalanced_Solution(TreeNode root){
        if(root==null){
            return false;
        }
        int d1 = deep(root.left);
        int d2 = deep(root.right);
        if(d1-d2>=-1&&d1-d2<=1){
            return true;
        }
        return false;
    }
    public static int deep(TreeNode root){
        if(root==null){
            return 0;
        }
        int d1 = deep(root.left);
        int d2 = deep(root.right);
        if(d1>d2){
            return d1+1;
        }else {
            return d2+1;
        }
    }
}
