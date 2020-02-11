package 二叉树的的深度;


public class Solution {
    public int TreeDepth(TreeNode root){
        if (root==null){
            return 0;
        }
        int d1 = TreeDepth(root.left);
        int d2 = TreeDepth(root.right);
        int m;
        if(d1>=d2){
            m = d1;
        }else {
            m = d2;
        }
        return m+1;
    }
}
