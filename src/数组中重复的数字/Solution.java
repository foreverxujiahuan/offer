package 数组中重复的数字;

import java.sql.Array;
import java.util.Arrays;

public class Solution {
    public static boolean duplicate(int numbers[],int length,int[] duplication){
        if(numbers.length==0){
            return false;
        }
        Arrays.sort(numbers);
        int flag=1;
        for(int i=0;i<length-1;i++){
            if(numbers[i]==numbers[i+1]){
                duplication[0] = numbers[i];
                flag=0;
                break;
            }
        }
        return flag==0;
    }
    public static void main(String[] args){
        int[] numbers = {};
        int length = 0;
        int[] duplication = {0};
        System.out.println(duplicate(numbers,length,duplication));
    }
}
