package day14_multi_branch_if_statements;


import java.util.Scanner;

public class CalculatorV1 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operator = '*';

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
            /*
            num1, num2
char operator -> -, +, *, /

when operator: + : add num1, num2
when operator: - : minus num1, num2
when operator: * : multiply num1, num2
when operator: / : divide num1, num2
any other: "invalid operator"
             */



