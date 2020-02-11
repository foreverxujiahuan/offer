package 数值的整数次方;

public class Solution {
    public static double Power(double base,int exponent){
        double res = 1;
        if(exponent<0){
            int n = -exponent;
            for(int i=0;i<n;i++){
                res = res*base;
            }
            return 1/res;
        }
        for(int i=0;i<exponent;i++){
            res = res*base;
        }
        return res;
    }
    public static void main(String[] args){
        double base = 2;
        int exponent = 0;
        double res = Power(base,exponent);
        System.out.println(res);
    }
}
