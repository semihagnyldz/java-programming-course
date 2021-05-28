package day33_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word="java";
        String [] wordArray=word.split("a");
        System.out.println(wordArray.length);
        System.out.println(Arrays.toString(wordArray));
    }
}
