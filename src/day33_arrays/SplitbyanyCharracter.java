package day33_arrays;

import java.util.Arrays;

public class SplitbyanyCharracter {
    public static void main(String[] args) {
        String words2= "java1html3sql";
        String [] strArr=words2.split("\\d");
        System.out.println(Arrays.toString(strArr));
        words2= words2.replaceAll("\\d", "_");
        System.out.println("word2: "+words2);

    }
}
