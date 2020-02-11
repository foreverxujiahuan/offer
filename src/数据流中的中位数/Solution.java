package 数据流中的中位数;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static List<Integer> nums = new ArrayList<>();
    public static void Insert(Integer num){
        nums.add(num);
    }
    public static Double GetMedian(){
        Collections.sort(nums);
        int l = nums.size();
        if(l%2==1){
            return 1.0*nums.get(l/2);
        }else {
            int mid_index = l/2;
            int a = nums.get(mid_index);
            int b = nums.get(mid_index+1);
            return 1.0*(a+b)/2;
        }
    }
}
