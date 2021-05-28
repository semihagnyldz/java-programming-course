package ImportantConcept;
import java.util.Scanner;
public class next_nextLine_scanner {
    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Enter your last name");
        String lastName= scan.nextLine();
        //scan.nextLine();
// this part is already provided DO NOT CHANGE
        System.out.println("Enter your email");
        String email = scan.next();
        scan.nextLine();//to capture Enter key press
        System.out.println("Enter your street");
        String street = scan.nextLine();
        // continue for city
        System.out.println("Enter your city");
        String city= scan.next();
    }
}
