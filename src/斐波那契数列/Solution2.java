package 斐波那契数列;

public class Solution2 {
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
        int n = 0;
        int res = Fibonacci(n);
        System.out.println(res);
    }
}
