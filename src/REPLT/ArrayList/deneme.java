package REPLT.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        int [] nums= {1,2,3,4,5};
        int reversedNums []= new int [5];
        for(int i=0; i<nums.length; i++) {


            int temp = nums[i-1];
            nums[i-1] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;

        }
        System.out.println(Arrays.toString(reversedNums));








    }
}
