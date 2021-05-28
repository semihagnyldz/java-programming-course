package day09_scanner_practice;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your hourly rate:");
        double rate= scan.nextDouble();

        System.out.println(rate*8*5+ " is your weekly pay,"+ rate*8*5*4+ " is your monthly pay, "+ rate*8*5*52+ " is your annual pay");

        /*
        enter hourly rate
        50
        we need calculate:weeklyPay, monthlyPay, annualPay
        print all three in 3 lines

         */

    }
}