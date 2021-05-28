package REPLT.methods;

public class countLetterss {
    public static void main(String[] args) {
        String str="sesli";

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
        System.out.println(numberOfLetters);
    }
}
