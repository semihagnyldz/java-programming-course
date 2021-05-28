package day29_nestedloops_arrays;

public class NestedForLoops {
    public static void main(String[] args) {
        for(int minutes=1; minutes<=5; minutes++){
            System.out.println("minutes = " + minutes);
            for(int seconds=1; seconds<=60; seconds++){
                System.out.println(seconds+" ");
            }
        }
        for(int minute=0; minute<=2; minute++){
            System.out.println("minute = " + minute);
            for(int second=0; second<=59; second++){
                System.out.println(minute+": "+second);
            }
        }
    }
}
