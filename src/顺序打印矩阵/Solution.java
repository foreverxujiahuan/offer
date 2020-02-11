package 顺序打印矩阵;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<Integer> printMatrix(int [][] matrix){
        int row = matrix.length;
        ArrayList<Integer> res = new ArrayList<>();
        if(row==0){
            return res;
        }
        int col = matrix[0].length;
        int right=col-1;
        int left=0;
        int up = 0;
        int down = row-1;
        int k=1;
        int s=col*row;
        while (k<=s){
            for (int i=left;i<=right&&k<=s;i++){
                res.add(matrix[up][i]);
                k++;
            }
            for(int i=up+1;i<=down&&k<=s;i++){
                res.add(matrix[i][right]);
                k++;
            }
            for (int i=right-1;i>=left&&k<=s;i--){
                res.add(matrix[down][i]);
                k++;
            }
            for(int i = down-1;i>up&&k<=s;i--){
                res.add(matrix[i][left]);
                k++;
            }
            left = left+1;
            right = right-1;
            up = up+1;
            down = down-1;
        }
        return res;
    }
    public static void main(String[] args){
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(matrix);
        System.out.println(printMatrix(matrix));
    }
}
