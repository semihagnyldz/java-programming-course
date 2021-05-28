package REPLT.methods;

import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        /*
        Write a method countLetters that can count letters in a given string and return a new string in the given format:
number of letters + letter
number of letters + letter
Example:
input: countLetters("aaabbcccc");
output: "3a2b4c"
         */
        String word="sesli";
        int countLetters=0;
        String nonRepeatedWord="";
        for(int i=0; i<word.length(); i++) {
                if(!nonRepeatedWord.contains(word.charAt(i)+"")){
                    nonRepeatedWord+=word.charAt(i);
                }

            }
        for(int i=0; i<nonRepeatedWord.length(); i++){
            for(int j=0; j<word.length(); j++){
                if(nonRepeatedWord.charAt(i)==word.charAt(j)){
                    countLetters++;
                }
            }
            System.out.println(""+countLetters+nonRepeatedWord.charAt(i));
            /*
            String numberOfLetters="";
    for(int i=0; i<str.length(); i++){
      int count =0;
      for(int j=0; j<str.length(); j++){
        if(str.charAt(i)==str.charAt(j)){
          count++;
        }

      } if(!numberOfLetters.contains(""+str.charAt(i))){
       numberOfLetters +=count+""+str.charAt(i); }
    }
             */
        }


        }





    }

