package day31_arrays;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArraysUtil {
    public static void main(String[] args) {
        int [] num= {5,1,7,0};
        System.out.println(Arrays.toString(num)); //changing  int to String: printing array values without using the loops, this is only for this line..temporary.
        System.out.println(num); // bu sekil print etmio, loop kullanman lazim yada arrays.tostring() method
        // with loop:
       for(int i=0; i< num.length; i++){
           System.out.println("with for loop: "+num[i]+" ");
       }

        System.out.println();
       for(int eachNum:num){
           System.out.println("with each for loop: "+eachNum);
       }

       //to sort num:
        Arrays.sort(num); //bunu sout icine yazinca sana sorting return etmio. otomatili num u sorting haline cevirdi
        System.out.println(Arrays.toString(num));
        System.out.println(num[0]); //gives you the min value always
        System.out.println(num[num.length-1]);//gives you the max value.
        System.out.println();

        String[] word= {"java", "C#","C++", "Kotlin", "Phyton", "Ruby", "assembly"};
        //print all this in one line:
        //1. way:

        for(int i=0; i<word.length; i++){
            System.out.print(word[i]+" ");
        }
        System.out.println();
        //2. way:
        for(String tektek:word){
            System.out.print(tektek+" ");
        }
        System.out.println();
        //3. way:
        System.out.println(Arrays.toString(word)); // println yazsanda yanyana cikario
        System.out.println(String.join(" *** ", word)); // buda printl yazmama ragmen yanyana cikardi. sadece string de calisio.

        Arrays.sort(word);
        System.out.println(Arrays.toString(word));
        Arrays.sort(word, Collections.reverseOrder());
        System.out.println(Arrays.toString(word));

    }
}
