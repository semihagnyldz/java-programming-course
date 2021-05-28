package OfficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        /*
        Given an ArrayList of Strings and a letter (char) print how many times the letter is found in the ArrayList elements
        Ex:Input:”java”, ”html”, “css”, “java”, “javascript”, “selenium”letter: ‘a’Output:6
String numbers to sumGiven an ArrayList of numbers in String format,
add each digit of each element and store into a different ArrayList. Ex:Input: “123”,“34”,“513”Output:[ 6, 7, 9 ]

         */
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "css", "java", "javascript", "selenium"));
        char targetLetter = 'a';

        int count = 0;
        for (String word : words) {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == targetLetter) {
                    count++;
                }
            }

        }
        System.out.println(targetLetter + " was found " + count);


        }



    }

