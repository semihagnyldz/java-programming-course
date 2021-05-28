package OfficeHours.Practice_03_10_2021;
import java.util.Scanner;

public class MovieDuration {
    public static void main(String[] args) {
        //if statemnet, is to control the flow of the code.
        Scanner input= new Scanner(System.in);//input is the object name
        System.out.println("Enter the length of the movie");
        double movieLength=input.nextDouble();
        double price=0;//we are initializing price one time...
        //buraya price i initiliaze etmeseydik, asagida if in icine yazdigimiz price lar ok ama if in disina yazdigimiz price lar run olmuor. mesela line 19 hata verio, cunku if in disinda.
        if(movieLength==1){
           price=8.99; //yukarda double price dedigimiz icin, bidaha double yazmaya gerek yok
            System.out.println("the movie costs is "+price);
        }
        if(movieLength==1.5){
           price=10.50;
            System.out.println("the movie cost is "+price);
        }
        if(movieLength==2.0){
            price=14.89;
            System.out.println("the movie cost is "+price);
        }
        if(movieLength==2.5){
            price= 23.09;
            System.out.println("the movie cost is "+price);
        }
        System.out.println("price: "+price);



     }
}
