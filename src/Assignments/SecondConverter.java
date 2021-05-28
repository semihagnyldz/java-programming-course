package Assignments;
import java.util.Scanner;

public class SecondConverter {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int inPutSeconds, hours, minutes, seconds;
        System.out.println("Enter seconds:");
        inPutSeconds=scan.nextInt(); //7234
    /*
    1 minutes= 60 second;
    1 hour= 3600 second
    3700 second: there is 1 hour and 100 second left.
    in order to find minute 100 second/60= minutes which is 1 minute and remaning is the second

     */
        hours= inPutSeconds/3600;
        inPutSeconds%=3600;
        minutes= inPutSeconds/60;
        inPutSeconds%=60;
        seconds=inPutSeconds;


        System.out.println(hours+" hours, "+minutes+" minutes, "+seconds+" seconds");
        /*
        hours = inputSeconds / 3600;  // 3695 /3600 = 1
        //inputSeconds = inputSeconds % 3600; // 95
        inputSeconds %= 3600; // 3695 - 3600 = 95
        minutes = inputSeconds / 60; // 95 / 60 = 1
        inputSeconds %= 60; // 35
        seconds = inputSeconds;
         */
    }
}
