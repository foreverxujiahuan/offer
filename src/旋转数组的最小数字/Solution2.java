package 旋转数组的最小数字;

public class Solution2 {
    public static int minNumberInRotateArray(int[] array){
        int l = array.length;
        for(int i=0;i<l-1;i++){
            if(array[i]>array[i+1]){
                return array[i+1];
            }
        }
        return 0;
    }
}
