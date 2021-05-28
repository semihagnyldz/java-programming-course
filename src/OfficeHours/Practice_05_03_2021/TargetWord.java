package OfficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class TargetWord {
    public static void main(String[] args) {
        /*
        Given an ArrayList of Strings and
        a target word (String) print how many times the target word is in the ArrayList
        Ex:Input:”java”, ”html”, “css”,“java”, “javascript”, “selenium”Target:javaOutput:2
         */
        String targetWords= "css";
        ArrayList<String> words= new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript","selenium"));
        int count=0;
        for (String word:words){
            if(word.equals(targetWords)){
                count++;
            }
        }
        System.out.println(targetWords+" was found "+count);
    }
}
