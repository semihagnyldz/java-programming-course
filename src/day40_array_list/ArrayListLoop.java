package day40_array_list;
import java.util.*;
public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums= new ArrayList<>(); //polymorphic way of declaring
        System.out.println(nums);
        System.out.println(nums.size());
        nums.add(34); nums.add(3); nums.add(0);
        System.out.println(nums);
        nums.remove(new Integer(34));
        //nums.remove(34); this means 34. index which there is no such a thing.

        // if you remove the first index, the second index will be the new first index.
        for(int i=0; i<nums.size(); i++){
            System.out.println(nums.get(i));
        }
        for(int each: nums){// we can also type for(Integer each: nums)
            System.out.print(each+" ");
        }
    }
}
