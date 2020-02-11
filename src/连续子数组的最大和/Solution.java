package 连续子数组的最大和;
import java.util.Arrays;
public class Solution {
    public static int FindGreatestSumOfSubArray(int[] array){
        int l = array.length;
        int res = -99999999;
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                int t = 0;
                int k =i;
                while (k!=j+1){
                    t = t+array[k];
                    k++;
                }
                if(t>res){
                    res = t;
                }
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] array = {-2,-8,-1,-5,-9};
        int res = FindGreatestSumOfSubArray(array);
        System.out.println(res);
    }
}