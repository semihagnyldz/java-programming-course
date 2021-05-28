package day31_arrays;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        //Arrays.binarySearch(Arrayname, item):
        int [] nums= {33,55,123,400};
        Arrays.binarySearch(nums, 55); //binary serach iicn nums i herxaman ilk sort yapman lazim
        System.out.println(Arrays.binarySearch(nums, 55));

        int[] numss={23, 123, 654, 2344, 12345, 14421};
        System.out.println(Arrays.binarySearch(numss, 2344));
        System.out.println(Arrays.binarySearch(nums, 45));

        if(Arrays.binarySearch(numss, 123)>=0){
            System.out.println("123 is present in array");
        }else{
            System.out.println("123 is not present");
        }


    }
}
