package day38_methods;

import java.util.Locale;

public class StringUtilsReversePalindrome {
    public static void main(String[] args) {

        System.out.println(isNullOrEmpty("hello"));
        String word= null;
        System.out.println(word.toUpperCase(Locale.ROOT));//word is null so it cant run:it is nullpointerexception
        System.out.println("*************");
        System.out.println(isNullOrEmpty(word));
    }
    public static boolean isNullOrEmpty (String str){// return ne edecekse method un onune yazman lazim, burda boolean return etcek.
        return (str==null || str.isEmpty());
        /*
        or:
        if(str==null || str.isEmpty()){
             return true;
             }
             return false;
         */

    }
    public static boolean isPalindrome(String str){
        str=str. toLowerCase(Locale.ROOT);
        for(int i=0; i<str.length()/2; i++){
            if(str. charAt(i)!=str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;



    }
    public static String reverse (String str){
        String reversed= "";
        for(int i=str.length()-1; i>=0; i--){
            reversed+=str.charAt(i);
        }
        return reversed;
    }


    }


