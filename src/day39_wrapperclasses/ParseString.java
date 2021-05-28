package day39_wrapperclasses;

public class ParseString {
    public static void main(String[] args) {
        String total= "345";
        int count= Integer.parseInt(total);
        System.out.println(count);

        String strPrice= "123.5";
        double price= Double.parseDouble(strPrice); //cant write strPrice>100, this is not number so cant compare.
        System.out.println(strPrice);
        if(price>=100){

        }

        String sentence= "I wrote 8567 lines of code";
        //split by space, parse index 2 to int
        String [] words=sentence.split(" ");
        int linesOfCode= Integer.parseInt(words[2]);
        System.out.println(linesOfCode);

        int [] nums= {3,5,6,7,8};
        for (int i=0; i<4; i++){
            if(i%2==0){
                continue;
            }
            System.out.println(i);

        }
        String str= "cybertek";
        for (int i=0; i<=str.length(); i+=2){
            System.out.print(str. charAt(i));
        }

    }
}
