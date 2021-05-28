package REPLT.Arrays;
import java.util.Scanner;
public class Array_maxNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt(), input.nextInt()};
        // DO NOT TOUCH ABOVE
        //TODO: Write your code below.
        int maxNumber = nums[0];
        //int [] indexOfMaxNumber=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > maxNumber) {
                maxNumber= nums[i];//4
                //indexOfMaxNumber=nums[i];

            }
        }
        System.out.println(maxNumber);
    }
}
