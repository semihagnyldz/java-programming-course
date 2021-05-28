package Assignments;
import java.sql.SQLOutput;
import java.util.Scanner;



public class ScannerPracticeKidsName {
    public static void main(String[] args) {
        Scanner T= new Scanner(System.in);
        System.out.println("Please type your DOB: ");
        String dogumTarihi= T.next();
        System.out.println("You were born in "+dogumTarihi);
    }
}
