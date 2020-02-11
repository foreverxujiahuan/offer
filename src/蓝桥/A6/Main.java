package 蓝桥.A6;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        int i=0;
        int j=0;
        int k=0;
        while (n>i){
            int t1 = sc.nextInt();
            A[i] = t1;
            i++;
        }
        while (n>j){
            int t2 = sc.nextInt();
            B[j] = t2;
            j++;
        }
        while (n>k){
            int t3= sc.nextInt();
            C[k] = t3;
            k++;
        }
        Arrays.sort(A);
        Arrays.sort(B);
        Arrays.sort(C);
        int res = 0;
        for(int p1=0;p1<n;p1++){
            int temp1=0;
            int temp2=0;
            for(int p2=0;p2<n;p2++){
                if(B[p2]>A[p1]){
                    temp1 = n-p2;
                    break;
                }
            }
            for(int p3=0;p3<n;p3++){
                if(C[p3]>A[p1]){
                    temp2 = n-p3;
                    break;
                }
            }
            res = res+(temp1)*(temp2);
        }
        System.out.println(res);
    }
}
