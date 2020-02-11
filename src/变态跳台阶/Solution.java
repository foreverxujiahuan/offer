package 变态跳台阶;

public class Solution {
    public static int JumpFloorII(int target){
        int res=1;
        for(int i=0;i<target-1;i++){
            res = res*2;
        }
        return res;
    }
    public static void main(String[] args){
        int n = 0;
        System.out.println(JumpFloorII(n));
    }
}
