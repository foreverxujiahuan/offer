package 蓝桥.A9;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] map = new String[n];
        for(int i=0;i<n;i++){
            map[i] = sc.next();
        }
        int n1=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(map[i].charAt(j)=='#'){
                    n1=n1+1;
                }
            }
        }
        int n2=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i==0||map[i-1].charAt(j)=='#')&&(j==0||map[i].charAt(j-1)=='#')&&(i==n-1||map[i+1].charAt(j)=='#')&&(j==n-1||map[i].charAt(j+1)=='#')){
                    n2=n2+1;
                }
            }
        }
        int res = n1-n2;
        System.out.println(res);
    }
}
