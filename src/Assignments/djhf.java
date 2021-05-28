package Assignments;
import java.util.Scanner;


public class djhf {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int inPutSeconds, hours, minutes, seconds;
        System.out.println("Enter seconds:");
        inPutSeconds=scan.nextInt(); //7234
    /*
    60 sec=1 minutes
    60 minutes=1 hour
    3600 sec=1 hour
    */
        hours= inPutSeconds/3600;
        inPutSeconds%=3600;
        minutes= inPutSeconds/60;
        inPutSeconds%=60;
        seconds=inPutSeconds;

        System.out.println(hours+" hours,"+minutes+" minutes, "+seconds+" seconds");

    }

}
