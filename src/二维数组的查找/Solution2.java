package 二维数组的查找;

public class Solution2 {
    public static void main(String[] args){
        int array[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int target = 0;
        boolean res = Find(target,array);
        System.out.println(res);
    }
    private static boolean Find(int target,int array[][]){
        int m = array.length;
        int n = array[0].length;
        int i = m-1;
        int j = 0;
        while (i>=0&&j<n){
            if(array[i][j]<target){
                j++;
            }else if(array[i][j]>target){
                i--;
            }else {
                return true;
            }
        }
        return false;
    }
}
