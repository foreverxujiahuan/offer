package 机器人运动范围;
public class Solution2 {
    private static int f(int n){
        int res = 0;
        while (n>0){
            res += n%10;
            n = n/10;
        }
        return res;
    }
    public static int movingCount(int threshold,int rows,int cols){
        boolean visit[] = new boolean[rows*cols];
        return movingCountCore(threshold,rows,cols,0,0,visit);
    }
    private static int movingCountCore(int threshold,int rows,int cols,int row,int col,boolean[] visit){
        int count = 0;
        if(flag(threshold,rows,cols,row,col,visit)){
            visit[row*cols+col] = true;
            count = 1+movingCountCore(threshold,rows,cols,row+1,col,visit)+
                      movingCountCore(threshold,rows,cols,row,col+1,visit)+
                      movingCountCore(threshold,rows,cols,row-1,col,visit)+
                      movingCountCore(threshold,rows,cols,row,col-1,visit);
        }
        return count;
    }
    private static boolean flag(int threshold,int rows,int cols,int row,int col,boolean[] visit){
        return col>=0&&col<cols&&row>=0&&row<rows&&!visit[row*cols+col]&&(f(col)+f(row)<=threshold);
    }
    public static void main(String[] args){
        int n = 35;
        int res = f(n);
        System.out.println(res);
    }
}
