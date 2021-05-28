package day10_shorthand_operator;
import java.util.Scanner;

public class NextLineBug {
    public static void main(String[] args) {
        Scanner meliha= new Scanner(System.in);
        System.out.println("what is your rent and month: ");
        double rent= meliha.nextDouble();
        meliha.nextLine(); // this is for fixing the bug
        String month= meliha.nextLine();
        System.out.println("rent = " + rent);
        System.out.println("month = " + month);



    }
}
