package OfficeHours.Practice_04_14_2021;

public class Array_LongestPalindrome { //BU YARIM KALDI...4.14.OFFICE HOURS, 40 MINS..
    //FOR PRACTICE: if we dont need indexs , no need for for loop, just use for each loop.
    public static void main(String[] args) {
        /*
        Given a String array. Find the longest Palindrome String in your array.
Ex:
Input: [“java”, “longer word”, “civic” “apple”, “racecar”, “mom”, “anna”]
Output: racecar
Ex:
Input: [“abc”, “dna”, “kevin”, “joe”, “lamp”]
Output: No palindrome
         */
        String [] words= {"java", "longer word", "civic", "apple", "racecar", "mom", "ann"};
        String longestPalindrome= "";
        for(String palindromeOrNot:words){

        }
        for(String eachWord:words){

            if(eachWord.length()>longestPalindrome.length()){
                longestPalindrome=eachWord;
            }

        }
        System.out.println(longestPalindrome);
    }
}
