package REPLT.methods;

import jdk.internal.org.objectweb.asm.tree.MultiANewArrayInsnNode;

public class StringAddToString {
    public static void main(String[] args) {
        /*
        at3 accepts two strings and returns a string.
The first string is the one that will be manipulated. At the 3rd char position of target you will insert the word argument.
Example: at3("longword","foo")
return: "lonfoogword"
         */

        String word="gun";
        String word2="e";
       String word3= word.substring(0,3);
       String wordLast=word.substring(3);
        System.out.println(word3+word2+wordLast);
    }
}
