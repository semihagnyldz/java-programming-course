package day45_oop;


public class barbieObject {
    public static void main(String[] args) {
        barbie barbieDoll= new barbie();
        //barbieDoll.song= "frozen"; ama bole yapmicaz frozen i direk changeTheSong methoduna koycam
        barbieDoll.changeTheSong("sofia");// we control the data through the method.
        barbieDoll.singASong();
    }
}
