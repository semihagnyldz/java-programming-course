package REPLT;
import java.util.Scanner;
public class HappyValleySchoolSystem {
    public static void main(String[] args) {
        System.out.println("Enter your child's age: ");
        Scanner input=new Scanner(System.in);
        int age= input.nextInt();
        if(age<2){
            System.out.println("Ineligible");
        }else if(age==2){
            System.out.println("Toddler");
        }else if(age>=3 && !(age>5) || age<=5){
            System.out.println("Early Childhood");
        }else if(age==6 || age==7){
            System.out.println("Young reader");

        }else if(age>=8 && !(age>10) || age<=10){
            System.out.println("Elementary");
        }else if(age==11 || age==12){
            System.out.println("Middle");
        }else if(age==13){
            System.out.println("Impossible");
        }else if(age>=14 && !(age>16) || age<=16){
            System.out.println("High School");
        }else if(age==17 || age==18){
            System.out.println("Scholar");
        }else if(age>18){
            System.out.println("Ineligible");
        }
        /*
        less than 2, ineligible
2, toddler
3-5, early childhood
6-7, young reader
8-10, elementary
11 and 12, middle
13, impossible
14-16, high school
17-18, scholar
greater than 18, ineligible
         */
    }
}
