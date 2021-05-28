package day43_list_custom_classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class ListMethods {
    public static void main(String[] args) {
        System.out.println(getDays()); //this is enough to run the program it returns all the days.

        //getDays(): we can treat this as array lost and use all the other method forexample:
        getDays().size();
        System.out.println("getdays methods size: "+getDays().size()); //7
        System.out.println("getdays methods size: "+getDays().get(0)); //monday
        //store the method into variable:
        List<String> dayNames= getDays();
        System.out.println("day names: "+dayNames);
        //how to remove 6 karakter elements:
        dayNames.removeIf(d -> d.length()==6); //d is like i,j you can type anything : Lambda expression with removeIf method.
        System.out.println("day names after remove If: "+dayNames);
        //
        System.out.println(getRandomList(10));
    }
    public static List<String> getDays(){
        List<String> days= new ArrayList<>(Arrays.asList("monday","tuesday","wednesday","thursday","friday","saturday","sunday"));
        return days;
    }
    public static List<Integer> getRandomList (int size){
        Random random= new Random(101); // new Random object with 0-100 limit
        List<Integer> nums=new ArrayList<>();
        for(int i=0; i<=size; i++){
            nums.add(random.nextInt());//generate random number and add to list
        }
        return nums;
    }
}
