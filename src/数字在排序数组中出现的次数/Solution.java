package 数字在排序数组中出现的次数;

import java.util.Collections;

public class Solution {
    public int GetNumberOfK(int[] array,int k){
        int n = 0;
        int l = array.length;
        for(int i=0;i<l;i++){
            if(array[i]==k){
                n++;
            }
        }
        return n;
    }
}
