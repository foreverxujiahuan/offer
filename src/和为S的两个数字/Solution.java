package 和为S的两个数字;

import java.util.ArrayList;

public class Solution {
    public ArrayList<Integer> FindNumbersWithSum(int[] array,int sum){
        int l = array.length;
        ArrayList<ArrayList<Integer>> temp = new ArrayList<>();
        for(int i=0;i<l;i++){
            for(int j=i+1;j<l;j++){
                if(array[i]+array[j]==sum){
                    ArrayList<Integer> t = new ArrayList<Integer>();
                    t.add(Math.min(array[i],array[j]));
                    t.add(Math.max(array[i],array[j]));
                    temp.add(t);
                }
            }
        }
        int Min = 9999999;
        int ll = temp.size();
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0;i<ll;i++){
            int s = temp.get(i).get(0)*temp.get(i).get(1);
            if(s<Min){
                Min=s;
                res = temp.get(i);
            }
        }
        return res;
    }
}
