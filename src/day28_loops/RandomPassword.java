package day28_loops;

import java.util.Random;

public class RandomPassword {
    public static void main(String[] args) {
        String source= "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789_!@#$%^&*";
        Random random= new Random();
        String password="";

        for(int i=1; i<=8; i++){
            int index= random.nextInt(34);
            System.out.println(source. charAt(index));
            //add the char to password variable using+=
            password+=source.charAt(index);

        }
        System.out.println("Your password= "+password);

    }
}
