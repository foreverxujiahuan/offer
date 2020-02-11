package 机器人运动范围;

public class Solution {
    public static int movingCount(int threshold,int rows,int cols){
        if(threshold<0||rows<1||cols<1){
            return 0;
        }
        boolean[] visited = new boolean[rows*cols];
        return movingCountCore(threshold,rows,cols,0,0,visited);
    }
    private static int movingCountCore(int threshold,int rows,int cols,int row,int col,boolean[] visited){
        int count = 0;
        if(check(threshold,rows,cols,row,col,visited)){
            visited[row*cols+col] = true;
            count = 1
                    + movingCountCore(threshold,rows,cols,row-1,col,visited)
                    + movingCountCore(threshold,rows,cols,row,col-1,visited)
                    + movingCountCore(threshold,rows,cols,row+1,col,visited)
                    + movingCountCore(threshold,rows,cols,row,col+1,visited);
        }
        return count;
    }
    private static boolean check(int threshold,int rows,int cols,int row,int col,boolean[] visited){
        return col>=0&&col<cols&&row>=0&&row<rows&&!visited[row*cols+col]&&(getDigitSum(col)+getDigitSum(row)<=threshold);
    }
    private static int getDigitSum(int number){
        int result = 0;
        while (number>0){
            result += (number%10);
            number /= 10;
        }
        return result;
    }
    public static void main(String[] args){
        int threshold = 5;
        int rows = 10;
        int cols = 10;
        int res = movingCount(threshold,rows,cols);
        System.out.println(res);
    }
}
