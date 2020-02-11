package 树的子结构;

public class Solution {
    public static boolean HasSubtree(TreeNode root1,TreeNode root2){
        if(root1==null||root2==null){
            return false;
        }
        return HasSubtree(root1.left,root2)||flag(root1.right,root2)||flag(root1,root2);
    }
    public static boolean flag(TreeNode root1,TreeNode root2){
        if(root2==null){
            return true;
        }
        if(root1==null||root1.val!=root2.val){
            return false;
        }
        return flag(root1.left,root2.left)&&flag(root1.right,root2.right);
    }
}
