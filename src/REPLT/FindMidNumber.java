package REPLT;
import java.util.Scanner;

public class FindMidNumber {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your first number");
        int firstNumber, secondNumber, thirdNumber;
        firstNumber= input.nextInt();
        System.out.println("Enter your second number");
        secondNumber= input.nextInt();
        System.out.println("Enter your third number");
        thirdNumber= input.nextInt();
        if(firstNumber<secondNumber && secondNumber<thirdNumber){
            System.out.println("your middle number is "+ secondNumber);
        }
        /*
        Write a program that will return mid number out of three numbers. No need to do any calculations.

Create an object of Scanner class.

Declare int 3 variables: num1, num2, num3.
         */
    }
}
