package REPLT.Arrays;
import java.util.Scanner;
public class Arrays_findingLargestLength {
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        String[] words = {"semiha", "nagihan","meliha", "hafsa","hasan"};

        /*for (int i = 0; i < 5; i++) {

            words[i] = input.nextLine();
        }

         */
        String largestWord=words[0];
            for(int i=0; i< words.length; i++){
                String currentWord= words[i];
                if(currentWord.length()>largestWord.length()){
                    largestWord=currentWord;
                }

            }
        System.out.println(largestWord);


        }
    }

