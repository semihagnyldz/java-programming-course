package day14_multi_branch_if_statements;
import java.util.Scanner;
public class IfWithoutElse {
    public static void main(String[] args) {
        System.out.println("Enter the year: ");
        Scanner input=new Scanner(System.in);
        double year= input.nextDouble();
        //boolean enter= year==2020;
        if(year==2020){
            System.out.println("cover up mask");
        }

    }
}
