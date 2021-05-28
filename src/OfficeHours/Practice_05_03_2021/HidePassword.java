package OfficeHours.Practice_05_03_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class HidePassword {
    public static void main(String[] args) {
        /*
        Given an array of passwords (String).
        Hide each password as a star (*) and show the hidden passwordEx:Input:{"one", "hi", "hold}Output: [ ***, **, **** ]
         */
        String [] password= {"apple","one", "hold"};
       // ArrayList ile index worry etmeme gerek yok
        ArrayList<String> hiddenPassword= new ArrayList<>();
        for(String each:password){
            hiddenPassword.add(convertToStars(each));
        }
        System.out.println("original: "+ Arrays.toString(password));
        System.out.println("hidden: "+hiddenPassword);

    }
    public static String convertToStars (String str){
        String stars= "";
        for(int i=0; i<str.length(); i++){
            stars+= "*";
        }
        return stars;
    }
}
