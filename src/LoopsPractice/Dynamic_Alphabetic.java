package LoopsPractice;
import java.util.Scanner;
public class Dynamic_Alphabetic {
    public static void main(String[] args) {
        Scanner scan=new Scanner (System.in);
        String answer="";
        System.out.println(" do you want upper or lower?");
        answer=scan.next();
        /*char starting=0;
        char ending=0;

        for (int i=starting; i<=ending; i++){
            if(answer.equals("upper")){
                starting='A';
                ending='Z';
            }else{
                starting='a';
                ending='z';
            }
        }
        System.out.println(starting+"--"+ending);
        System.out.println(starting);

         */
        System.out.println("&&&&&&& SeECOND WAY!!&&&&&&&&&");
        if(answer.equals("upper")) {

            for (char ch = 'A'; ch <= 'Z'; ch++) {
                System.out.print(ch+" ");

            }
        }else {
            for (char ch='a'; ch<='z'; ch++){
                System.out.print(ch+" ");
            }
        }



        /*
        [Dynamic alphabet]
• Write a program that will ask ‘upper’ or ‘lower’
• If it is upper: print the alphabet in all uppercase letter from A to Z
• If it is lower: print the alphabet in all uppercase letter from a to z
- Challenge: Also ask if they want to show the alphabet in ascending or
order descending
- Ascending: A – Z or a – z
- Descending: Z – A or z – a
         */
    }
}
