package REPLT.methods;
import java.util.Scanner;
public class countAppearance {
    public static int countAppearance(String[] arr, String t) {
        int count = 0;
        for( String each:arr){
            if(each.equals(t)){
                count++;
            }

        }
        return count;


    } //end  count_appearance

    public static void main(String[] args) {
        //Scanner in = new Scanner(System.in);
        String[] strs = {"semiha", "semiha","can","can","hafsa"};
        String word = "hafsa";

        for (int i = 0; i < strs.length; i++) {
            strs[i] = word;
        }

        System.out.println(countAppearance(strs, word));

    }
}
