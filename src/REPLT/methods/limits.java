package REPLT.methods;

public class limits {
    public static void main(String[] args) {
        /*
        This method gets a string and an int, it returns a string.
The method will limit the given String by a certain amount of characters(given int)
Examples:limit("abcd",2)
returns "ab"
         */
        //public static String limits (String word, int maxLength)
        String word= "semiha";
        int maxLength= 2;
        System.out.println(word.substring(0,maxLength));


    }
}
