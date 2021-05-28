package day18_conditions_practice_strings_intro;

public class BugggggLargestNumber {
    public static void main(String[] args) {
        int num1=10;
        int num2=10;
        int num3= 67;
        if (num1>num2 && num2>num3){
            System.out.println("largest number is "+num1);
        }else if(num2>num1 && num1>num3){
            System.out.println("the largest number is: "+num2);
        }else if(num3>num1 && num1>num2){
            System.out.println("largest number is "+num3);
        }
    }
}
