package day33_arrays;

import java.util.Arrays;

public class MultiDArrayExample {
    public static void main(String[] args) {
        String [][] users= new String[3][2];
        users[0][0]= "Semiha GUN";
        users[0][1]="semihagn";
        users[1][0]="meliha yildiz";
        users[1][1]="melhylds";
        users [2][0]="hafsa yildiz";
        users [2][1]="hafsylds";
        //shorter way:
        String [][] userData= {{"semiha GUN","semihagn"},
                                {"meliha yildiz", "melhylds"},
                                {"hafsa yildiz","hafsylds"}};
        System.out.println(users[0][1]);
        System.out.println(userData[2][1]);
        System.out.println(Arrays.deepToString(userData));
    }
}
