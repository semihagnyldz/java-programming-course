package day23_string_manipulation_while_loop;

import java.util.Locale;

public class ChainingStringMethods {
    public static void main(String[] args) {
        String word="woo  den spoon";
        System.out.println(word.toUpperCase(Locale.ROOT).toLowerCase().length());
        System.out.println("word.replace(\" \",\"\").toUpperCase() = " + word.replace(" ", "").toUpperCase());
        String city= "chicago";
        System.out.println(city.substring(0,1).toLowerCase()+city.substring(1));

        //.isEmpyt(). toUpperCase() does not work since is Empty is boolean.



    }
}
