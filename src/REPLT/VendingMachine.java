package REPLT;
import java.util.Scanner;
public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter cents:");
        int cents = scan.nextInt();
        int quarters = cents/25;
        int remainderAfterQuarters = cents % 25;
        int dimes = remainderAfterQuarters / 10;
        int remainderAfterDimes = remainderAfterQuarters % 10;
        int nickels = remainderAfterDimes / 5;
        int pennies = remainderAfterDimes % 5;

        if(cents>0 && cents<100){
            System.out.println("Your change is "+quarters+" quarters, "+dimes+" dimes, "+nickels+" nickels, and "+pennies+" pennies");
        }else{
            System.out.println("Invalid cents amount");
        }
    }
}
