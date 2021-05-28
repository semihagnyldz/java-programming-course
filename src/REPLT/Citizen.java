package REPLT;
import java.util.Scanner;

public class Citizen {
    public static void main(String[] args) {
        int seniorCitizens, nonSeniorCitizens, age;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens: ");
        System.out.println("What is new citizen's age?");
        seniorCitizens= input.nextInt();
        nonSeniorCitizens= input.nextInt();
        int count;
        age= input.nextInt();
        if(age>=65){
           // System.out.println("Senior Citizen "+count);
            //count++;

        } else if(age<65){
          //  System.out.println("Non-Senior Citizen "+count);
           // count--;
        }
        System.out.println("New seniorCitizen count ValueOfVariable ");
        /*
        if citizen's age is more than or equals to 65 then print "Senior Citizen" and increment seniorCitizens variable by 1.

if citizen's age is less than 65 then print "Non-Senior Citizen" and increment nonSeniorCitizens variable by 1.

Last print another message:

"New seniorCitizens count ValueOfVariable"

"New nonSeniorCitizens count ValueOfVariable"
         */
    }
}
