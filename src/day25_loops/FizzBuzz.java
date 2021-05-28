package day25_loops;

public class FizzBuzz {
    public static void main(String[] args) {
        for(int i=0; i<100; i++){
            // System.out.println(i); herzaMAN BUNU YAP BI BAK LOOP CALISIO MU
            if(i%3==0 && i%5==0){
                System.out.println("fizzbuzz");
            }else if(i%3==0){
                System.out.println("fizz");
            }else if(i%5==0){
                System.out.println("buzz");
            }
        }
    }
}
