package OfficeHours.Practice_05_05_2021;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
        int [] nums= {1,2,4,5,8,5,2};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        String [] names= {"semiha","hafsa","meliha"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        for(String eachName: names){
            System.out.println("names: "+eachName);
        }
    }
}
