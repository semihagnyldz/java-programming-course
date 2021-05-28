package OfficeHours.Practice_04_13_2021;

import java.util.Arrays;

public class Array_GradeBook {
    public static void main(String[] args) {
        /*
        Declare three arrays:
1. String array which will hold names for the students (give values)
2. Int array which has the score of the student got in the quiz (give values)
3. Char array which will have some letter grade based on the score (empty)
4. Output the gradebook at the end with all the information
Grade scale:
Above 85: A
Above 75: B
Above 65: C
Other: D
         */
        String [] names= {"Anna", "Nancy", "Sarah"};
        int [] scores= {90, 75, 80};
        char [] grades= new char [3]; //new char[names.length] diyebiliriz, ya da new char[scores.length] bc hepsi size ayni olmali.
        //char [] grades= {'A','B','C'}; //BOLE DE YAZILIR, IF LER CHAR KISMI DYNAMIC OLSUN DIE.
       // System.out.println(Arrays.toString(grades));
        System.out.println(Arrays.toString(scores));
        System.out.println(Arrays.toString(names));
        System.out.println("Grade Scale: ");
       for(int i=0; i< names.length; i++){
            //int eachScore=scores[i]; ayni zamanda scores[i].
            if(scores[i]>=85){ //BUNUN YERINE scores[i] yazabilirsin.
                grades[i]= 'A';
                System.out.println(names[i]+" && "+grades[i]+" && "+scores[i]);//bu sout u en asagiya bir tane daha for loop yapip yazdirbilirsin.
            }else if(scores[i]>=75){
                grades[i]='B';

            }else if(scores[i]>=65){
                grades[i]='C';
            }else{
                grades[i]='D';
            }
        }


        System.out.print(Arrays.toString(names)+": "+Arrays.toString(scores)+": "+Arrays.toString(grades));
        System.out.println();


        for(int i=0; i< names.length; i++){
            System.out.println(names[i]+"| "+grades[i]+"| "+scores[i]);
        }
    }
}
