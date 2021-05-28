package REPLT;
import java.util.Scanner;
public class Overdose {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Enter number of miligrams in drink: ");




        double overdose= 10_000;

        double numOfMilligrams=input.nextDouble();
        double drinkCount=overdose/numOfMilligrams;
        System.out.println(drinkCount);
    }

    }

