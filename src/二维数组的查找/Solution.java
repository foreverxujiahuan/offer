package 二维数组的查找;

public class Solution {
    public static boolean Find(int target,int [][] array){
        int row = array.length;
        int col = array[0].length;
        int i=0;
        int j=col-1;
        while (i>=0&&j>=0&&i<row&&j<col){
            int t =array[i][j];
            if(target==array[i][j]){
                return true;
            }
            if(t<target){
                i++;
            }
            if(t>target){
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[][] arr = {{1,2,3,4},{2,4,9,12},{4,7,10,13},{6,8,11,15}};
        int target = 16;
        System.out.println(Find(target,arr));
    }
}
