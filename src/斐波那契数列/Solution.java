package 斐波那契数列;

public class Solution {
    public static int Fibonacci(int n){
        int a=0;
        int b=1;
        for(int i=0;i<n;i++){
            int t = b;
            b = a+b;
            a = t;
        }
        return a;
    }
    public static void main(String[] args){
        int n = 4;
        System.out.println(Fibonacci(n));
    }
}
