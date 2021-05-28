package day09_scanner_practice;
import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in); // burda scanner object create ettik
        System.out.println("How old are you?");
        // scan.nextInt(); burda scanner class objecti kullanmaya baslioruz but we dont store it now.
        int age= scan.nextInt();
        System.out.println(age+ " oo that's great");
        //hardcoding the value: assigning the value to a variable in your code.for eaxnple int age= 36; not from scanner or any other source
        //scanner class gives us a capability to pass values/inputs into our java programs.

    }
}
