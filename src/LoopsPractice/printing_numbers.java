package LoopsPractice;

public class printing_numbers {
    public static void main(String[] args) {

        //Write a program that can calculate the sum of all the numbers between 1 ~ 100
        int sums=0;
        for(int i=0; i<100; i++){
            sums+=i;
        }
        System.out.println(sums);
        //Write a program that can calculate the sum of all the numbers between 1 ~ 100
        System.out.println("************************************");

        int evenNumbers=0;
        for(int i=2; i<=100; i++){
            if(i%2==0){
                evenNumbers+=i;
            }
        }
        System.out.println("1st way: "+evenNumbers);
        System.out.println("**********************************");
        int evenSum=0;
        for(int i=2; i<=100; i=i+2){
            evenSum+=i;
        }
        System.out.println("2nd way: "+evenSum);



        // Write a program that can calculate the sum of all the odd numbers between 1 ~ 100
        int oddNumbers=0;
        for(int i=1; i<=99; i++){
            if(i%2==1){
                oddNumbers+=i;
            }
        }
        System.out.println("oddNumbers: "+oddNumbers);
        System.out.println("******************************");
        int oddNumbers1=0;
        for(int i=1; i<=99; i=i+2){
            oddNumbers1+=i;
        }
        System.out.println("oddNumbers1: "+oddNumbers1);
        System.out.println("******************************");
        //Write a program that can print all the ODD numbers between 0 ~ 100 that can be divisible by 3 & 5

        for(int i=1; i<=99; i=i+2){
            if(i%5==0 && i%3==0){
                System.out.println(i);
            }
        }
        //• Write a program that can print all the EVEN numbers between 0 ~ 100 that can be divisible by 3 & 5

        for (int i=2; i<=100; i=i+2){
            if(i%3==0&&i%5==0){
                System.out.println(i);
            }
        }

    }
}
