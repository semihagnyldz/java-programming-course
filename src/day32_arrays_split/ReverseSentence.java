package day32_arrays_split;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        //INTERVIEW QUESTIONS:
        String sentence="java is fun";
        String[] reverseSentence= sentence.split(" ");
       /* for(String reverse:reverseSentence) {
            System.out.println(reverse);
            //System.out.println(reverseSentence[i]);
        }

        */
        for(int i=reverseSentence.length-1; i>=0; i--){
            System.out.print(reverseSentence[i]+" ");
        }


    }
}
