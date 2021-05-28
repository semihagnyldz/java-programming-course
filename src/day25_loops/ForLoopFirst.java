package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {

       /* this is infinite loop:
        for(;;){
            System.out.println("Java is fun!");
        }
        bu da ayni isi yapio: while(true){   } bu yontem daha populer
        */
        for(int i=0; i<=5; i++){
            System.out.println("Hello world");
        }
        for(int i=1; i<10; i++){
            System.out.println("i = " + i);
        }
    }

}
