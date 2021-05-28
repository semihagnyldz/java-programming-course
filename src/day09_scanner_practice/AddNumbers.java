package day09_scanner_practice;
import java.util.Scanner; //import scanner class

public class AddNumbers {
    public static void main(String[] args) {
        //create object first
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your favorite 2 numbers: ");
        //System.out.println("Please enter your least favorite number: ");
        int num1= scan.nextInt();//bu satir pc nin diger ucundaki user a sormamizi saglio, obur turlu biz sayi verioruz code yazarken
        int num2= scan.nextInt();
        System.out.println("result: "+ (num1+num2));
        // or int result= num1+num2
       /* enter 2 number
         5
         4
         result: 9

        */

    }
}
