package REPLT.methods;

import java.util.Arrays;

public class coverMe {
    public static void main(String[] args) {
        /*
        The coverString method will take 2 string parameters from the caller.
Your job is to write an important code that will :to search and find each appearance of coverME within main
then surround it with square brackets [coverMe] if you cannot find the coverME within main then just return whole
main itself covered [main].keep in mind that coverME value can be of any length.
Examples:
coverString("java methods", "me") ) ; ==> "java [me]thods"
coverString("java methods", "me") ) ; ==> "java [me]thods"
coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
coverString("Certified Wooden Spoon", "o") ) ; ==> "Certified W[o][o]den Sp[o][o]n"
coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
coverString("hello hello", "ello") ) ; ==> "h[ello] h[ello]"
coverString("apples", "pears") ) ; ==> "[apples]"
         */
        //public static String coverString (String one, String two)
        String one= "semiha";
        String two= "h";
        if(one.contains(two)){
            one=one.replaceAll(two, "["+two+"]");
        }else{
            one="["+one+"]";
        }

    }
}
