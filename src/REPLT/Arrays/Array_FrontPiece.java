package REPLT.Arrays;

import java.util.Arrays;

public class Array_FrontPiece {
    public static void main(String[] args) {
       int num[]={10,5,6};
        //System.out.println(Arrays.toString(num[0])+Arrays.toString(num[1]));



        for (int i=0; i<num.length; i++){
            int first= num[i];
            int second= num[i+1];
            System.out.println(first+""+second);
        }


    }
}
