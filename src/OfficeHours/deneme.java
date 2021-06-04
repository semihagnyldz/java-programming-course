package OfficeHours;

import java.util.Arrays;

public class deneme {
    public static void main(String[] args) {
       // String name= "semiha";
       // String lastName="yildiz";
        /*int lengthOfSemiha= name.length();
        int lastCharIndex= lengthOfSemiha -1;
        char lastChar= name.charAt(lastCharIndex);
        System.out.println(lastChar);

         */
       // System.out.println(name.concat(lastName).concat(name).concat(lastName));
       // System.out.println(name.charAt(0)+""+lastName.charAt(0)
                          // +name.charAt(1)+lastName.charAt(1)
                          // +name.charAt(2)+lastName.charAt(2));

        int [] num1= {1,2,3,4,5,6};
        for (int i = 0; i < num1.length; i++) {
            int temp= num1[i];
            num1[i]= num1[num1.length-1];
            num1[num1.length-1]= temp;
        }


        System.out.println(Arrays.toString(num1));
        String sentence= "semiha is 35";
        String [] splitSentence= sentence.split(" ");
        for (int i = splitSentence.length-1; i >=0 ; i--) {
            System.out.println(splitSentence[i]);
        }



    }


}
