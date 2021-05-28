package REPLT;
import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);

        System.out.println("Enter the number you want to use in the equation");
        int number= input.nextInt();
        if(number<0){
            System.out.println("num= "+number);
            System.out.println("negative");
        } else if (number==0){
            System.out.println("num= "+number);
            System.out.println("zero");
        } else if(number>0){
            System.out.println("num= "+number);
            System.out.println("positive");
        }
    }
}
