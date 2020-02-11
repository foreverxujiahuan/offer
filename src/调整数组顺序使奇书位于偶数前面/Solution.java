package 调整数组顺序使奇书位于偶数前面;

public class Solution {
    public static void reOrderArray(int [] array){
        int l = array.length;
        for(int i=0;i<l-1;i++){
            for(int j=0;j<l-1;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        reOrderArray(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
