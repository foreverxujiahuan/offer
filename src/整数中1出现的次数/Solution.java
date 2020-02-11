package 整数中1出现的次数;

public class Solution {
    public static void main(String[] args){
        int n = 13;
        int res = NumberOf1Between1AndN_Solution(n);
        System.out.println(res);
    }
    public static int NumberOf1Between1AndN_Solution(int n){
        int res = 0;
        for(int i=1;i<=n;i++){
            res = res+f(i);
        }
        return res;
    }
    private static int f(int n){
        int count = 0;
        while (n!=0){
            if(n%10==1){
                count++;
            }
            n = n/10;
        }
        return count;
    }
}
