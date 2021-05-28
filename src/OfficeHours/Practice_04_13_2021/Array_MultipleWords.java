package OfficeHours.Practice_04_13_2021;

import java.util.Arrays;

public class Array_MultipleWords {
    public static void main(String[] args) {
        /*
        Given a String of words that are separate by commas. Find and print any words
that have more than one word
Example
Input: "knife, wooden spoons, plates, cups, forks, pan, pot, trash can, fridge,
dish washer”
Output:
wooden spoons
trash can
dish washer
         */
        String words="semiha gun, hafsa, meliha zelal yildiz";
        String [] arrWords= words.split(", ");
        System.out.println(Arrays.toString(arrWords));
        for (int i=0; i< arrWords.length; i++){
            if(arrWords[i].contains(" ")){
                System.out.println(arrWords[i]);
            }
        }
        for (String eachWord: arrWords){
            if(eachWord.contains(" ")){
                System.out.println(eachWord);
            }
        }


    }
}
