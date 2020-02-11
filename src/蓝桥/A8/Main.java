package 蓝桥.A8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int D = sc.nextInt();
        int K = sc.nextInt();
        int[][] tsid = new int[N][2];
        for(int i=0;i<N;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            tsid[i][0] = a;
            tsid[i][1] = b;
        }
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(tsid[i][1]>tsid[j][1]){
                    int[] temp = tsid[i];
                    tsid[i] = tsid[j];
                    tsid[j] = temp;
                }
            }
        }
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(tsid[i][0]>tsid[j][0]&&tsid[i][1]==tsid[j][1]){
                    int[] temp = tsid[i];
                    tsid[i] = tsid[j];
                    tsid[j] = temp;
                }
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
        int o = 0;
        for(int i=0;i<N;i++){
            int j=i;
            int t = 0;
            while (j<N&&tsid[i][1]==tsid[j][1]){
                if(Math.abs(tsid[i][0]-tsid[j][0])<D){
                    t = t+1;
                    j=j+1;
                }else {
                    j=j+1;
                }
            }
            if(t>=K){
               res.add(tsid[i][1]);
            }
        }
        ArrayList<Integer> res2 = new ArrayList<>();
        res2.add(res.get(0));
        for(int i=0;i<res.size()-1;i++){
            if(res.get(i)!=res.get(i+1)){
                res2.add(res.get(i+1));
            }
        }
        for(int i=0;i<res2.size();i++){
            System.out.println(res2.get(i));
        }
    }
}
