package REPLT;

import java.util.Arrays;

public class questions {
    public static void main(String[] args) {
        String word="java";
        String [] wordArray=word.split("");
        for(int i= wordArray.length-1;i>=0; i--){
            System.out.println(Arrays.toString(wordArray));
        }
    }
}
