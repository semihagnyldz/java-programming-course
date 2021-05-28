package day38_methods;
import static day38_methods.StringUtilsReversePalindrome.*;
public class StringUtilTest {
    public static void main(String[] args) {
        String userName="";
        if(StringUtilsReversePalindrome.isNullOrEmpty(userName)){
            System.out.println("fail: username cannot be null or empty");
        }
        System.out.println("isPalindrome(civic) = "+ StringUtilsReversePalindrome.isPalindrome("civic"));
        System.out.println("isPalindrome(kayak)= "+ StringUtilsReversePalindrome.isPalindrome("kayak"));
        System.out.println("isPalindrome(semiha= "+ StringUtilsReversePalindrome.isPalindrome("semiha"));
        System.out.println("isPalindrome(cybertek)= "+ StringUtilsReversePalindrome.isPalindrome("cybertek"));
        System.out.println("isPalindrome(hafsa)= "+isPalindrome("hafsa"));
    }

}
