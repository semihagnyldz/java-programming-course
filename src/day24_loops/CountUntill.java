package day24_loops;
import java.util.Scanner;
public class CountUntill {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number to count until: ");
        int numberToStop= scan.nextInt();
        int start=1;
        while(start<=numberToStop){
            System.out.println("start = " + start);
            start++;
        }
    }
}
