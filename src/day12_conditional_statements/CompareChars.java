package day12_conditional_statements;

public class CompareChars {
    public static void main(String[] args) {
        char letter1='w';
        char letter2= 'c';
       // boolean is= letter1<letter2;
        System.out.println(letter1==letter2); //false
        System.out.println(letter1<letter2); //false
        System.out.println(letter1>letter2); //true
        System.out.println(letter1!=letter2);//true

        char grade= 'A';
        boolean passed= grade<='D';
        System.out.println("Did you the exam?"+ passed);
        // for comparison, result always boolean type.

    }
}
