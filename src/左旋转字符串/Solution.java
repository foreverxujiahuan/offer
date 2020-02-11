package 左旋转字符串;

public class Solution {
    public static String LeftRotateString(String str,int n){
        int l = str.length();
        if(n>l){
            return new String("");
        }
        String a = str.substring(0,n);
        String b = str.substring(n,l);
        String res = b+a;
        return res;
    }
    public static void main(String[] args){
        String s = "abcXYZdef";
        int n = 3;
        String res = LeftRotateString(s,3);
        System.out.println(res);
    }
}
