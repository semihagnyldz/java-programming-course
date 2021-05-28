package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {


        List<Integer> nums= new ArrayList<>(Arrays.asList(2,4,4,1,5,6,0,6));
        System.out.println("original nums: "+nums);
        List<Integer> uniqueList= new ArrayList<>(); //new arraylist to store the unique numbers
        // loop through the list to find a unique numbers
        for(int num:nums){ //i can only type Integer instead of int.
            if (Collections.frequency(nums, num)==1) {
                System.out.print(num+" ");
                uniqueList.add(num);

            }


        }
    }
}
