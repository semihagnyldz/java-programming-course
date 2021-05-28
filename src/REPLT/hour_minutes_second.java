package REPLT;
import java.util.Scanner;


public class hour_minutes_second {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
       // System.out.println("what is the hour?");
        int hour= scan.nextInt();
       // System.out.println("hour: "+hour);

       // System.out.println("what is the minute: ");
        int minute= scan.nextInt();
       // System.out.println("minute: "+ minute);

       // System.out.println("what is the second: ");
        int second= scan.nextInt();
        //System.out.println("second = " + second);
        String amOrPm= scan.next();

        System.out.println("the time is: "+hour+ ":"+minute+":"+second+""+amOrPm);
    }
}
