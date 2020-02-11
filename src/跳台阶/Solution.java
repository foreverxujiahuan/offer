package 跳台阶;

public class Solution {
    public static int JumpFloor(int target){
        int a = 1;
        int b = 1;
        for(int i=0;i<target;i++){
            int t = b;
            b = a+b;
            a = t;
        }
        return a;
    }
    public static void main(String[] args){
        int target = 3;
        System.out.println(JumpFloor(target));
    }
}
