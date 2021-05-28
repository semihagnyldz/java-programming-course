package day21_string_manipulation;

public class FirstandLastLetter {
    public static void main(String[] args) {
        String word= "mom";
        char first= word.charAt(0);
        char last= word.charAt(2);
        if(first==last){
            System.out.println("first and last letter match");
        }else{
            System.out.println("mismatch");
        }
        if(word. charAt(0)==word.charAt(2)){
            System.out.println("match!");
        }
        char lastLetter=word.charAt(word.length()-1);
        System.out.println(lastLetter);

    }
}
