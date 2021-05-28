package LoopsPractice;
import java.util.Scanner;
public class PrintNTimes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your n number");
        int n = scan.nextInt();
        //WRITE YOUR CODE HERE
        int count = 0;
        while (count < n) {
            System.out.print("*");
            count++;
        }
    }
}
