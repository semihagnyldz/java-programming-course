package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters= new ArrayList<>();
        letters.addAll(Arrays.asList('a','j','v','a', 'i','s','f','u','n'));
        //howmany letter:
        System.out.println("size: "+letters.size());
        System.out.println("letters: "+letters);
        Collections.reverse(letters);
        System.out.println("reversed: "+letters);
        Collections.frequency(letters,'a');
        System.out.println("freguency of a in letters: "+Collections.frequency(letters,'a'));
        //store frequency:
        int vCount= Collections.frequency(letters, 'v');
        System.out.println("vCount = " + vCount);
        System.out.println("max char= "+Collections.max(letters));
        System.out.println("min char= "+Collections.min(letters));
        Collections.replaceAll(letters,'j','a');
        System.out.println("after replaceAll: "+letters);
        Collections.sort(letters);//doesnt return anything just sort it.
        System.out.println("after sorting: "+letters); //it is sorting according to alphabet.
        List<Integer> nums =Arrays.asList(23,1,43,5,234,7,-9,0);
        System.out.println("nums: "+nums);
        Collections.reverse(nums);
        System.out.println("after reverse: "+nums);
        int max= Collections.max(nums);
        int min= Collections.min(nums);
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        int countOfFives= Collections.frequency(nums,5);
        System.out.println("countOfFives = " + countOfFives);
        int countOf1s= Collections.frequency(nums,1);
        System.out.println("countOf1s = " + countOf1s);
        Collections.replaceAll(nums,5,50);
        System.out.println("after replace 5 to 50: "+nums);
        Collections.sort(nums, Collections.reverseOrder());
        System.out.println("after reverse sort= "+nums);
        Collections.shuffle(nums);
        System.out.println("after shuffle= "+nums); //randomly changing

    }
}
