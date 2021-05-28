package day40_array_list;

import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> nums= new ArrayList<>();
        nums.add(11);
        nums.add(5);
        System.out.println("size: "+nums.size());
        //reading from arraylist:
        System.out.println(nums.get(0));
        //System.out.println(nums.get(3));
        System.out.println(nums);
        nums.remove(0);
        System.out.println(nums);

    }


}
