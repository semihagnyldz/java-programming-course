package day21_string_manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word= "java";
        System.out.println(word.charAt(0));
        String company= "Cybertek";
        System.out.println("first letter: "+company.charAt(0));
        char first= company.charAt(0);
        System.out.println("first = " + first);
        char second= company.charAt(1);
        char third=company.charAt(2);
        char fourth=company.charAt(3);
        char fifth= company.charAt(4);
        char sixth=company.charAt(5);
        char seventh=company.charAt(6);
        char eight= company.charAt(7);
        //char nieth=company.charAt(8);
        System.out.println(first+" "+second+" "+third+" "+fourth+" "+fifth+" "+sixth+" "+seventh+" "+eight+" ");
    }
}
