package day39_wrapperclasses;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(3,6));
        System.out.println(Double.max(34.5,45.2));
        System.out.println("max double: "+Double.MAX_VALUE);
        System.out.println(Double.compare(5,1));//1
        System.out.println(Double.compare(5,5));//0
        System.out.println(Double.compare(5,15));//-1

        System.out.println(Character.isDigit('8'));//true
        System.out.println(Character.isDigit('v'));//false
        System.out.println(Character.isAlphabetic('q'));//true
        System.out.println(Character.isLetter('&')); //false
       // System.out.println(Character.isUpperCase());
        String word= "JaVa iS Fun";
        for(int i=0; i<word.length(); i++){
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i));
            }
            /*else if(Character.isLowerCase(word.charAt(i))){
                System.out.print(word.charAt(i));

             */
            //IQ: how do you convert String into numbers?
            //we can use parse or valueOf methods in wrapper classes.
            String total="345";
            int count= Integer.parseInt(total); // parseInt: take string and convert into numbers
            String strPrice= "123.89";
            double price= Double.parseDouble(strPrice);


        }
    }
}
