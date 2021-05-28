package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word= "java";
        for(int i=0; i<word.length(); i++){
            System.out.println(word.charAt(i));
        }
        String word2 = "selenium";
        for(int i = 0; i< word2.length(); i++){
            System.out.println(word2.charAt(i));
        }
        String words = "I will be SDET insh";
        for(int i = 0; i< words.length(); i++){
            System.out.print(words.charAt(i));
        }
        System.out.println();
        String wordReverse= "java";
        for(int i=wordReverse.length()-1; i>=0; i--){
            System.out.print(word.charAt(i));
        }
    }
}
