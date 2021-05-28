package day08_casting_scanner;
import java.util.Scanner;


public class ScannerIntro {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String firstName= scan.next();
        System.out.println("Hello "+firstName);
       // scan.close(); optionally close the scanner
        // declarin the object is Scanner scan= new Scanner(System.in);
        //using the object is int num= scan.nextInt();



    }
}
