package day42_arraylist;

import java.util.Arrays;
import java.util.List;

public class sumIntegerList {
    public static void main(String[] args) {
        List<Integer> nums= Arrays.asList(1,2,3,4,5,6);
        int sum= sumIntegerList(nums);
        System.out.println(sum);

        sumIntegerList(Arrays.asList(1,2,3,4));
    }
    public static int sumIntegerList(List<Integer> intList) {
        int sum=0;
        for(int each: intList){
            sum+=each;
        }
        return sum;

    }
}

