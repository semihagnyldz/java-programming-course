package day25_loops;

public class PrintEvenOrOddNumbers {
    public static void main(String[] args) {
        for (int numEven = 1; numEven <= 100; numEven++) {
            if (numEven % 2 == 0) {
                System.out.print(numEven+" ");
            }
            System.out.println();
            for (int numOdd=1; numOdd<=100; numOdd++){
                if(numOdd%2==1){
                    System.out.print(numOdd);
                }
            }

        }
    }
}
