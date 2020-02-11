package 翻转单词序列;

public class Solution {
    public static String ReverSentence(String str){
        if(str == null){ return null;}
        if(str.trim().equals("")){
            return str;
        }
        String strs[] = str.split(" ");
        String res = new String("");
        int l = strs.length;
        for(int i=l-1;i>=0;i--){
            if(i!=0){
                res = res+strs[i]+' ';
            }else {
                res = res+strs[i];
            }
        }
        return res;
    }
    public static void main(String[] args){
        String str = new String(" ");
        String res = ReverSentence(str);
        System.out.println(res);
    }
}
