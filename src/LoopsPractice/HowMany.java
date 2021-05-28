package LoopsPractice;

public class HowMany {
    public static void main(String[] args) {
        String str= "2juMp41EEkd4s4";
        int upperCase=0, lowerCase=0, number=0; // ; measn that this is the end.
        for(int i=0; i<str.length(); i++) {// check the string till the end.
            char eachLetter= str.charAt(i);
            if(eachLetter>= 'A' && eachLetter<= 'Z'){
                upperCase++;
            }else if(eachLetter>='a'&& eachLetter<='z'){
                lowerCase++;
            }else if(eachLetter>='0' && eachLetter<='9'){
                number++;

            }
        }
        System.out.println("upperCase = " + upperCase);
        System.out.println("lowerCase = " + lowerCase);
        System.out.println("number = " + number);
    }
}
