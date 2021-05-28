package REPLT;
import java.util.Scanner;
public class PartyV2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String guestList = "";
        String answer= "";

        System.out.println("Please enter guest name:");
        String newGuest = input.next();
        guestList+=newGuest+", ";

        do{
            System.out.println("Do you want to enter new guest name:");
            answer=input.next();

            if(answer.equals("yes")){
                System.out.println("Please enter guest name:");
                newGuest = input.next();
                guestList+=newGuest+", ";

            } else if(answer.equals("no")){
                System.out.println("Guest's list: "+guestList);

            }

        }while(!answer.equals("no"));
    }
}
