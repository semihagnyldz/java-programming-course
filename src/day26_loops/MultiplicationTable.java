package day26_loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        int mul=1;
       for(int num=1; num<=10; num++){
           mul=num*2;
           System.out.println(num+" X "+2+" = "+mul);
       }
       int number=2;
       int multiple=1;
       for(int i=1; i<=10; i++){
           multiple=i*number;
           System.out.println(number+"X"+i+"="+multiple);
       }

    }
}
