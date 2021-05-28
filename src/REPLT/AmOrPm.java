package REPLT;
import java.util.Scanner;
public class AmOrPm {
    public static void main(String[] args) {
        int hour, minute, second;
        String amOrPm;
        int inputSeconds=0;





        //DO NOT TOUCH BELOW LINES. TEACHER WILL SET VALUES
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the second:");

        //#############################

        //2. WRITE YOUR CODE HERE:
        hour=inputSeconds/3600;//3678

        inputSeconds=inputSeconds%3600;

        minute= inputSeconds/60;

        inputSeconds= inputSeconds%60;

        second = sc.nextInt();



        amOrPm = sc.next();



        System.out.println(hour+":"+minute+":"+second+""+amOrPm);
    }
}
