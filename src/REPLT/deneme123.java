package REPLT;
import java.util.Scanner;

public class deneme123 {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        System.out.println("enter word please");
        String word= scan.next();
        System.out.println("how many times you want to repeat?");
        int howmany=scan.nextInt();
        System.out.println("what do you want to add as separator");
        String seperator=scan.next();
        String result= "";
        for(int i=1; i<howmany; i++){
            result+= word+seperator;

        }
        result+=word;
        System.out.println(result);


    }

}









