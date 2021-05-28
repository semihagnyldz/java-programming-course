package REPLT;
import java.util.Scanner;
public class AverageScore {
    public static void main(String[] args) {
        System.out.println("Welcome to the Grader!");
        System.out.println("Please enter subject name number 1 and score for this subject");
        String subjectName1, subjectName2, subjectName3, subjectName4, subjectName5;
        double grade1, grade2, grade3, grade4, grade5;
        Scanner input= new Scanner (System.in);

        subjectName1=input.next();
        grade1=input.nextDouble();
        System.out.println("Please enter subject name number 2 and score for this subject");
        subjectName2=input.next();
        grade2=input.nextDouble();
        System.out.println("Please enter subject name  number 3 and score for this subject");
        subjectName3=input.next();
        grade3=input.nextDouble();
        System.out.println("Please enter subject name number 4 and score for this subject");
        subjectName4=input.next();
        grade4=input.nextDouble();
        System.out.println("Please enter subject name number 5 and score for this subject");
        subjectName5=input.next();
        grade5=input.nextDouble();

        double averageScore= (grade1+grade2+grade3+grade4+grade5)/5;

        System.out.println("Summary: "+subjectName1+" - "+grade1+", "+ subjectName2+" - "+grade2+subjectName3+" - "+grade3+", "+subjectName4+" - "+grade4+", "+subjectName5+" - "+grade5);
        System.out.println("Your average score is: "+averageScore);
        System.out.println("Thank you for using Grader!");
        System.out.println("Goodbye!");





    }
    }

