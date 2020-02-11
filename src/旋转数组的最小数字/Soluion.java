package 旋转数组的最小数字;

public class Soluion {
    public int minNumberInRotateArray(int [] array){
        int l = array.length;
        if(l==0){
            return 0;
        }
        for(int i=0;i<l-1;i++){
            if(array[i+1]<array[i]){
                return array[i+1];
            }
        }
        return 0;
    }
}
