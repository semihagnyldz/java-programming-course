package day14_multi_branch_if_statements;
import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        System.out.println("which day?: ");
        Scanner input=new Scanner(System.in);
        int day= input.nextInt();
        if(day==5){
            System.out.println("it is Monday");
        }else if (day==2){
            System.out.println("it is Tuesday");
        }else if (day==3){
            System.out.println("it is wednesday");
        }else if(day==4){
            System.out.println("it is thursday");
        }


    }
}
