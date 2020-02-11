package 矩形覆盖;

public class Solution {
    public static int RectCover(int target){
        if (target==0){
            return 0;
        }
        int a=0;
        int b=1;
        for(int i=0;i<target;i++){
            int t = b;
            b = a+b;
            a = t;
        }
        return b;
    }
    public static void main(String[] args){
        System.out.println(RectCover(2));
    }
}
