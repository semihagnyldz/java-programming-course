package REPLT.methods;

public class uniqueNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 3, 3, 3, 4, 5, 6, 7, 7, 7, 8};
        printUniqueNumbers(nums);
    }


    public static void printUniqueNumbers(int[] nums) {
        //WRITE YOUR CODE HERE
        for (int i = 0; i < nums.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[i] == nums[j]) {
                    isUnique = false;
                    break;
                }

            }
            if (isUnique) {
                System.out.println(nums[i]);
            }


        }
    }
}

