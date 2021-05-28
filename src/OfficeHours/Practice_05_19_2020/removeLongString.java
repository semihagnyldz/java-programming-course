package OfficeHours.Practice_05_19_2020;

import java.util.ArrayList;
import java.util.Arrays;

public class removeLongString {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("one","two","three","four", "five","six"));
        System.out.println(removeLongStrings(list, 4));
        System.out.println(removeLongStrings1(list, 5));

    }
    /*
    this method will acept an arraylist of strings and an int.
    remove any strings elements that have less charactres that the given number.
    return the modified arraylist of strings
    @param list- given arraylist of strings
    @param int- max number of charactres
    @return- arraylist of strings

    ex: {"one", "two", "three", "four", "five", "six"} max number:4
    output: {"three", "four", "five"}
     */
    public static ArrayList<String> removeLongStrings (ArrayList<String> list, int maxNum) {
        //create new arraylist:
        ArrayList<String> validStrings = new ArrayList<>();
        //simdi yeni arraylist yaptigimizi icin for ecah loop kullanabiliriz
        //for(String each: list){ //dont use for each if you try to remove sth.
        for (String word:list){
            if(word.length()>=maxNum){
                validStrings.add(word);
            }
        }
        return validStrings;

    }
    //with lambda:
    public static ArrayList<String> removeLongStrings1 (ArrayList<String> list, int maxNum){
        list.removeIf(each -> each.length()<maxNum);
        return list;

    }
}
