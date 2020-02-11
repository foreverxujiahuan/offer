package 替换空格;

public class Solution2 {
    public static void main(String[] args){
        String str = "we are happy";
        String res = replaceSpace(str);
        System.out.println(res);
    }
    private static String replaceSpace(String str){
        StringBuffer res = new StringBuffer("");
        int l = str.length();
        for(int i=0;i<l;i++){
            if(str.charAt(i)!=' '){
                res.append(str.charAt(i));
            }else {
                res.append("%20");
            }
        }
        return res.toString();
    }
}
