package 替换空格;

public class Solution {
    public static void main(String[] args){
        StringBuilder s = new StringBuilder("We Are Happy");
        String res = replaceSpace(s);
        System.out.println(res);
    }
    public static String replaceSpace(StringBuilder str){
        if(str==null){
            return null;
        }
        StringBuffer res = new StringBuffer();
        int l = str.length();
        for(int i=0;i<l;i++){
            if(str.charAt(i)==' '){
                res.append('%');
                res.append('2');
                res.append('0');
            }else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }
}
