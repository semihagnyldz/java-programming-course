package day24_loops;
import java.util.Scanner;
public class GiveMe5Dollars {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("give me 5 dollars");
        int dollars= input.nextInt();
        while( dollars!= 5){
            System.out.println("give me 5 dollars");
            dollars=input.nextInt();
        }
        System.out.println("thank you for your 5 dollars");
    }
}
