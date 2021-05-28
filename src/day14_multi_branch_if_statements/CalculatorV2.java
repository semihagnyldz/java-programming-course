package day14_multi_branch_if_statements;
import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        double num1;
        double num2;
        System.out.println("enter 2 number");
        Scanner input= new Scanner(System.in);

        num1 = input.nextDouble();
        num2 = input.nextDouble();

        System.out.println("enter the operator you wanna use");
        char operator = input.next().charAt(0);


        if (operator == '+') {
            System.out.println(num1 + num2);
        } else if (operator == '-') {
            System.out.println(num1 - num2);
        } else if (operator == '*') {
            System.out.println(num1 * num2);
        } else if (operator == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("just keep coding java");
        }
    }
}
