package 最小的K个数;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static ArrayList<Integer> GetLeastNumbers_Solution(int[] input,int k){
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(input);
        if(k>input.length){
            return res;
        }
        for(int i=0;i<k;i++){
            res.add(input[i]);
        }
        return res;
    }
}
