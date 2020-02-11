package 矩阵中的路径;

public class Solution {
    public static boolean hasPath(char[] matrix,int rows,int cols,char[] str){
        boolean visitFlags[] = new boolean[matrix.length];
        for(int row = 0;row<rows;row++){
            for(int col = 0;col<cols;col++){
                if(hasPathCore(matrix,rows,cols,row,col,str,0,visitFlags)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean hasPathCore(char[] matrix,int rows,int cols,int row,int col,char[] str,int k,boolean[] visitFlags){
        //定义Index，即当前的位置
        int index = row*cols+col;
        //当前位置的字符和要寻找的字符一样并且在矩阵范围内，则继续，否则返回false
        if(row<0||col<0||row>=rows||col>=cols||visitFlags[index]||matrix[index]!=str[k]){
            return false;
        }
        //代表这个格子已经走过了
        visitFlags[index] = true;
        //如果k等于str的长度-1，代表已经找完了所有的字符，已经可以了
        if(k==str.length-1){
            return true;
        }
        //k往前一个
        k++;
        if(hasPathCore(matrix,rows,cols,row+1,col,str,k,visitFlags)||
            hasPathCore(matrix,rows,cols,row-1,col,str,k,visitFlags)||
            hasPathCore(matrix,rows,cols,row,col+1,str,k,visitFlags)||
            hasPathCore(matrix,rows,cols,row,col-1,str,k,visitFlags)){
            return true;
        }
        //将这个格子重新释放
        visitFlags[index] = false;
        return false;
    }
}
