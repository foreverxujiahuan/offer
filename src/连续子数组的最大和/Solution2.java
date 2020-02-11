package 连续子数组的最大和;


public class Solution2 {
    public static int FindGreatestSumOfSubArray(int[] array){
        int l = array.length;
        int M = -9999999;
        int res = -999999;
        for(int i=0;i<l;i++){
            M = Math.max(M+array[i],array[i]);
            res = Math.max(res,M);
        }
        return res;
    }
    public static void main(String[] args){
        int array[] = {6,-3,-2,7,-15,1,2,2};
        int res = FindGreatestSumOfSubArray(array);
        System.out.println(res);
    }
}
