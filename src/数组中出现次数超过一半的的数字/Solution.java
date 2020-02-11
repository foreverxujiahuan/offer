package 数组中出现次数超过一半的的数字;

import java.util.Arrays;

public class Solution {
    public static int MoreThanHalfNum_Solution(int[] array){
        int l = array.length;
        if(l<1){
            return 0;
        }
        Arrays.sort(array);
        int count = 0;
        for(int i=0;i<l;i++){
            if(array[l/2]==array[i]){
                count++;
            }
        }
        if(count>l/2){
            return array[l/2];
        }
        return 0;
    }
    public static void main(String[] args){
        int[] array = {1,2,3,2,2,2,2,5,4,2};
        int res = MoreThanHalfNum_Solution(array);
        System.out.println(res);
    }
}
