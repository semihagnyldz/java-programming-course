package REPLT;
import java.util.Scanner;

public class If_OddEven {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int number= input.nextInt();
        boolean check= number % 2==0;
        if(check) {
            System.out.println(number+ " is even");
        }else{
            System.out.println(number+ " is odd");
        }


    }
}
