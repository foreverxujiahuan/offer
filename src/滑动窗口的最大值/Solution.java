package 滑动窗口的最大值;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static ArrayList<Integer> maxInWindows(int [] num,int size){
        ArrayList<Integer> res = new ArrayList<>();
        if(num.length==0||size==0){
            return res;
        }
        for(int i=0;i<num.length-size+1;i++){
            ArrayList<Integer> temp = new ArrayList<>();
            for(int j=i;j<size+i;j++){
                temp.add(num[j]);
            }
            res.add(Collections.max(temp));
        }
        return res;
    }
    public static void main(String[] args){
        int[] num = {2,3,4,2,6,2,5,1};
        int size = 3;
        System.out.println(maxInWindows(num,size));
    }
}
