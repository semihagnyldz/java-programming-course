package day37_methods_overloading;

public class MethodOverLoading {
    public static void main(String[] args) {
        sum("semiha", "gun");

    }
    /*public static int sum(int num1, int num2){
        //return

    }
    public static int sum(double num1, double num2){
        return sum;

    }
    public static int sum(int num1, int num2, int num3){
        return num1+num2+num3;

    }

     */
    public static void sum(String num1, String num2){
        System.out.println("Sum(String, String");
        System.out.println("result:" + (num1+num2));

    }

}
