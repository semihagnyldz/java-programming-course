package day19_class_vs_objects_strings;

import java.util.Locale;

public class StringCaseConversion {
    public static void main(String[] args) {
        String word="Cybertek";
        String sentence="Semiha GUN-YILDIZ";
        System.out.println(word.toLowerCase());
        System.out.println("Cybertek".toLowerCase(Locale.ROOT));
        System.out.println(sentence.toLowerCase(Locale.ROOT));
        System.out.println(word);
        word= word.toLowerCase(Locale.ROOT);
        System.out.println(word);
        System.out.println("GUN".toLowerCase(Locale.ROOT));
        String company= "Amazon";
        company= company.toLowerCase(Locale.ROOT);
        System.out.println(company);
    }
}
