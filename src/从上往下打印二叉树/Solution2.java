package 从上往下打印二叉树;

import java.util.ArrayList;
import java.util.Stack;

public class Solution2 {
    public static ArrayList<Integer> print(TreeNode root){
        ArrayList<Integer> res = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root==null){
            return res;
        }
        ArrayList<TreeNode> queue = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node = queue.remove(0);
            res.add(node.val);
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return res;
    }
}
