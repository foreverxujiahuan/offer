package 重建二叉树;

public class Solution {
    public TreeNode reConstructBinaryTree(int[] pre,int[] in){
        return reConstructBTree(pre,0,pre.length-1,in,0,in.length-1);
    }
    private TreeNode reConstructBTree(int[] pre,int startpre,int endpre,int[] in,int startin,int endin){
        if(startpre>endpre||startin>endin){
            return null;
        }
        TreeNode root = new TreeNode(pre[startpre]);
        for(int i=startin;i<=endin;i++){
            if(pre[startpre]==in[i]){
                root.left = reConstructBTree(pre,startpre+1,startpre+i-startin,in,startin,i-1);
                root.right = reConstructBTree(pre,startpre+1+i-startin,endpre,in,i+1,endin);
            }
        }
        return root;
    }
}
