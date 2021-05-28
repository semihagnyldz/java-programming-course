package OfficeHours.Practice_04_19_2021;

import day38_methods.StringUtilsReversePalindrome;

public class ReverseEachWord {
    public static void main(String[] args) {

    }
    public static String reverseEachWord (String str){
        String reverse="";
        for(String each: str.split(" ")){

            reverse+=StringUtilsReversePalindrome.reverse(each)+" ";


        }
        return reverse.trim();

    }
}
