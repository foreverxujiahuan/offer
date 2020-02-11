package 调整数组顺序使奇书位于偶数前面;

public class Solution2 {
    public static void main(String[] args){
        int array[] = {1,2,4,7,3};
        reOrderArray(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void reOrderArray(int[] array){
        int l = array.length;
        for(int i=0;i<l;i++){
            for(int j=0;j<l-1;j++){
                if(array[j]%2==0&&array[j+1]%2==1){
                    int t = array[j];
                    array[j] = array[j+1];
                    array[j+1] = t;
                }
            }
        }
    }
}
