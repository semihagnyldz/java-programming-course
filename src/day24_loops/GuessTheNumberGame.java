package day24_loops;
import java.util.Random;
import java.util.Scanner;
public class GuessTheNumberGame {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        Random randomNumber=new Random();


        int secretNumber=randomNumber.nextInt(101);
        int guessingNumber=0;
        do {
            System.out.println("Guess the secret number");
            guessingNumber = scan.nextInt();
            if(guessingNumber>secretNumber){
                System.out.println("wrong, number is too large");
            }else if(guessingNumber<secretNumber){
                System.out.println("guessing number is too small ");
            }

        } while (guessingNumber != secretNumber) ;
        System.out.println("Congrats, you found the number");

        }
    }

