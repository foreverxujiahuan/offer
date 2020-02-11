package 数组中只出现一次的数字;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public void FindNumsAppearOnce(int[] array,int num1[],int num2[]){
        int l = array.length;
        if(l==1||l==0){
            return;
        }
        Arrays.sort(array);
        List<Integer> res = new ArrayList<Integer>();
        for(int i=1;i<l-1;i++){
            if(array[i]!=array[i+1]&&array[i]!=array[i-1]){
                res.add(array[i]);
            }
        }
        if(array[l-1]!=array[l-2]){
            res.add(array[l-1]);
        }
        num1[0] = res.get(0);
        num2[0] = res.get(1);
    }
}
