package REPLT;
import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {
        /*
    Imagine you have a party and need to form the list of the guests. (Assume you have at least one guest)
Ask for the first guest name.
Then ask does user want to enter one more guests.
If yes - take the next guest input
If not - finish the program and print list of the guests.
 */
        Scanner input = new Scanner(System.in);
        String newGuestName;
        String guessName;
        do{
            System.out.println("Please enter guest name:");
            guessName=input.next();
            guessName+=guessName+",";
            System.out.println("Do you want to enter new guest name:");
            String answer=input.next();

           // System.out.println("what is the guest name?");
            //newGuestName=input.next();
        }
        while (guessName.equals("yes"));
            System.out.println("Your list: " +guessName);
        }
    }



