package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(2.4,7));
        System.out.println(minus(9,5.3));
        System.out.println(division(10,3.7));
        System.out.println(multiply(4,1.6));
    }
    public static double add(double num1, double num2){
        double sum=num1+num2;
        return sum;
    }
    public static double minus(double num1, double num2){
        double sum1=num1-num2;
        return sum1;
    }
    public static double multiply (double num1, double num2){
        return num1*num2;
    }
    public static double division(double num1, double num2){
        return num1/num2;
    }
}
