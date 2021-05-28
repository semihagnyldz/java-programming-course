package day18_conditions_practice_strings_intro;
import java.util.Scanner;
public class MultiBranchIf {
    public static void main(String[] args) {
        int number= 5;
        System.out.println("Enter the number");
        Scanner input= new Scanner(System.in);
        number=input.nextInt();
        if(number>0){
            System.out.println(number+" is positive");
        }else if (number<0){
            System.out.println(number+" is negative");
        }else if(number==0){
            System.out.println(number+" is zero");
        }
    }
}
