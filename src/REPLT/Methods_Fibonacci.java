package REPLT;
import java.util.Arrays;
import java.util.Scanner;
public class Methods_Fibonacci {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int[] arr = {in.nextInt(), in.nextInt(), in.nextInt(), in.nextInt()};
        Arrays.toString(do_switch(arr));
    }


    public static int[] do_switch(int[] i) {
        int a = i[3];
        i[3] = i[0];
        i[0] = a;
        System.out.println(Arrays.toString(i));
        return i;

    }
}



