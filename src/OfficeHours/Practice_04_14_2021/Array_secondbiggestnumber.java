package OfficeHours.Practice_04_14_2021;

public class Array_secondbiggestnumber {
    public static void main(String[] args) {
        /*
        Given an Array of numbers. Find and print the 2nd biggest number. Note
the 2nd biggest should be unique meaning it should be different from
the max number
Example:
Input:
[4,3,1,4,5,2,4,8,4,8]
Output:
5
         */
        int [] arr= {1,6,19,8,45,3};
        int biggestNumber=arr[0];
        int secondBiggestNumber=arr[0];
        for (int eachNumber: arr){
            if(eachNumber>biggestNumber){
                secondBiggestNumber=biggestNumber;
                biggestNumber=eachNumber;

                }
            if(eachNumber>secondBiggestNumber && eachNumber<biggestNumber){
                secondBiggestNumber=eachNumber;
            }
            }
        System.out.println(secondBiggestNumber);


        }

}
