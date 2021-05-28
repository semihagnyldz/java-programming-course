package day29_nestedloops_arrays;

public class StarsNestedLoop {
    public static void main(String[] args) {
        for(int outer=1; outer<=5; outer++){
            for(int inner=1; inner<=5; inner++){
                System.out.print("*");
            }
            System.out.println("* ");
        }
        for(int i=1; i<=10; i++){
            for(int ii=1; ii<=i; ii++){
                System.out.print("* ");
            }
            System.out.println(); // to go the new line
        }
    }
}
