package OfficeHours.Practice_04_21_2021;

public class PalindromeNumber {
    public static void main(String[] args) {
        //gives the last digit: number %10
        //gives the number without the last character
        System.out.println(isPalindrome(12321));


    }
    public static boolean isPalindrome (int number){
        int reverse=0;
        int temp=number;

        while (temp!=0){
            int lastDigit= temp%10;
           // reverse= lastDigit; //cannot do this: reverse+=lastDigit
            reverse= (reverse*10)+lastDigit;
            temp/=10;
            System.out.println(reverse);

        }
        return reverse == number;
    }
}
