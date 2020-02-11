package 蓝桥.A7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        int x = sc.nextInt();
        int m = Math.max(Math.abs(x),Math.abs(y));
        int t1 = (2*(m-1))+1;
        int t2 = t1*t1-1;
        int i = -m+1;
        int j = -m+1;
        int t3 = 0;
        while (i!=x||j!=y){
            if(i==-m+1&&j!=-m){
                j=j-1;
                t3++;
            }else if(j==-m&&i!=m){
                i=i+1;
                t3++;
            }else if(i==m&&j!=m){
                j=j+1;
                t3++;
            }else if(j==m&&i!=-m){
                i=i-1;
                t3++;
            }else if(i==-m){
                j=j-1;
                t3++;
            }
        }
        int res = t2+t3;
        System.out.println(res);
    }
}
