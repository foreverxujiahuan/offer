package 字符串的排列;

import java.util.ArrayList;

public class Solution {
    public static ArrayList<String> res = new ArrayList<>();
    public static ArrayList<String> permutation(String str){
        char chs[] = str.toCharArray();
        pre(chs,0,chs.length-1);
        return res;
    }
    private static void pre(char[] chs,int start,int end){
        if(start==end){
            if(!res.contains(String.valueOf(chs)))
            res.add(String.valueOf(chs));
        }
        for(int i=start;i<=end;i++){
            swap(chs,i,start);
            pre(chs,start+1,end);
            swap(chs,i,start);
        }
    }
    private static void swap(char[] chs,int i,int j){
            char tmp = chs[i];
            chs[i] = chs[j];
            chs[j] = tmp;
    }
    public static void main(String[] args){
        String s = "aa";
        ArrayList<String> sss = permutation(s);
        System.out.println(sss);
    }
}
