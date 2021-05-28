package OfficeHours.Practice_04_13_2021;
import java.util.Arrays;
import java.util.Scanner;
public class Array_SmallestAndLongest {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("how many words you would like to enter?");
        String [] words= new String[input.nextInt()];
        input.nextLine();
        for(int i=0; i< words.length; i++){
            System.out.println("enter word: "+(i+1));
            words[i]= input. nextLine();
        }
        System.out.println(Arrays.toString(words));
        String [] smallAndLarge= {words[0], words[1]}; //String smallest=words[0], String largest=words[0]
        //words[0]=smallest
        //words[1]=largest
        for(String eachWord: words){
            if(eachWord.length()<smallAndLarge[0].length()){ //if(eachWord. lengths()<smallest.length())
                smallAndLarge[0]=eachWord; //smallest=eachWord;
            }
            if (eachWord.length() > smallAndLarge[1].length()){
                smallAndLarge[1]=eachWord;
            }
        }
        System.out.println("smallest word is: "+smallAndLarge[0]); //normalde bunlari String smallest=""; die define ediorduk
        System.out.println("largest words is: "+smallAndLarge[1]);// bunu String largest="";
        System.out.println(Arrays.toString(smallAndLarge));






    }
}
