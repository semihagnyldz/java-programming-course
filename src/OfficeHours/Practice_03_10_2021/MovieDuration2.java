package OfficeHours.Practice_03_10_2021;

import java.util.Scanner;
//we use if statement to control how the program work and determining the price first=what saim said
//if statement doesnt have to have else statement

public class MovieDuration2 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the length of the movie");
        double movieLength=input.nextDouble();
        String priceInvalid="Invalid";
       // double price; //line 28 deki price gives error bc eger verdigimiz deger if statementlara uymuorsa en asagidaki sout verecek deger bulamayacak=yani price doesnt have a value
double price=0; //bu default value...bu sebepten herzaman o value olarak baslamak lazim
        //asagidaki butun sout lari kaldirip sadece price assign edicez: bu sefer hangi if statement dogruysa sadece 1 tane sout dakini print edicek
        //in this, code is controlling the price.
        if(movieLength==1){
            price=8.99;
           // System.out.println("the movie costs is "+price);
        }
        if(movieLength==1.5){
            price=10.50;
           // System.out.println("the movie cost is "+price);
        }
        if(movieLength==2.0){
            price=14.89;
           // System.out.println("the movie cost is "+price);
        }
        if(movieLength==2.5){
            price= 23.09;
           // System.out.println("the movie cost is "+price);
        }
        if(movieLength<=0){
            System.out.println("Invalid Price"); //bu condition dogru oldugunda en alttaki sout yine cikti ve sacma oldu price hem invalid yazio hem 0 cikio, oyuzden bu if condition icin else kullanmaliyiz
            //bu oluosa bunu kullan olmuosa digeri kullan die.
           // String priceInValid= "InValid";
            //String "InValid= (double) priceInvalid;
        }else{
            System.out.println("price: "+price); //bunu else icine aldigimiz icin en son sifir ve altinda degerler verince hem invalid hemde o price yazmiyacak, cunku code birini yazicak if ve else i kullandigimiz iicn
        }

    }
}
