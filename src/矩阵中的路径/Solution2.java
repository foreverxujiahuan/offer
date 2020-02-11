package 矩阵中的路径;

public class Solution2 {
    public static boolean hasPath(char[] matrix,int rows,int cols,char[] str){
        boolean visit[] = new boolean[rows*cols];
        for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                if(dfs(matrix,rows,cols,row,col,str,0,visit)){
                    return true;
                }
            }
        }
        return false;
    }
    private static boolean dfs(char[] matrix,int rows,int cols,int row,int col,char[] str,int k,boolean[] visit){
        int index = row*cols+col;
        if(row<0||col<0||row>=rows||col>=cols||visit[index]||str[k]!=matrix[index]){
            return false;
        }
        visit[index] = true;
        if(k==str.length-1){
            return true;
        }
        k++;
        if(dfs(matrix,rows,cols,row-1,col,str,k,visit)||
            dfs(matrix,rows,cols,row,col+1,str,k,visit)||
            dfs(matrix,rows,cols,row+1,col,str,k,visit)||
            dfs(matrix,rows,cols,row,col-1,str,k,visit)){
            return true;
        }
        visit[index] = false;
        return false;
    }
}
