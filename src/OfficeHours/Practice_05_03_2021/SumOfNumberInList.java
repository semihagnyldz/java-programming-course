package OfficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfNumberInList {
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<>(Arrays.asList("123","54","24"));

        for(int i=0; i<list.size(); i++){ // every element is string thats why we named string for each, each is: 123, 54, 24
            int totalSum=0;
            for(char digit:list.get(i).toCharArray()){ //digit to char array [1,2,3].
                totalSum+= Integer.parseInt(""+ digit); // we did "" bc digit is a char but we need a string

            }
            list.set(i, ""+ totalSum); //"" yaptik cunku totalsum is a number we need a string
        }
        System.out.println(list);
        //eger string varsa ve cahr yapmak istiosan:
        //String each:
        //each.toCharArray()
        //---
        //ArrayList<String> list:
        //list.get(i).toCharArray()
    }
}
