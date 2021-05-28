package day21_string_manipulation;

import java.util.Locale;

public class ReplacePractice {
    public static void main(String[] args) {
        String word= "github";
        System.out.println(word.toUpperCase());
        word= word.toUpperCase();
       System.out.println(word.toLowerCase(Locale.ROOT).replace("hub","lab"));
       word="gitlab";
        System.out.println(word.replace('i','o').replace('a','i'));//you can also do string: ""
        String sentence="java is fun";
        System.out.println(sentence.replace(" ",""));
        sentence=sentence.replace("java","selenium").replace("fun","a lot of fun").replace(" ","");
        System.out.println(sentence);

        String result= "1-48 of over 4,000 results for java book";
        result= result.replace("1-48 of over","").replace(" result for java book","");
        System.out.println("result = " + result);
        int count= Integer.parseInt(result);
    }
}
