package OfficeHours.Practice_05_19_2020;

public class MyBackYard {
    public static void main(String[] args) {
        Birds birdOne= new Birds();
        //System.out.println(birdOne.canFly);
        // can Fly is private cannot access outside of the class.
        birdOne.getCanFly();
        birdOne.setCanFly(true);
        System.out.println(birdOne.getCanFly());

        Birds birdTwo= new Birds();
        birdTwo.setBeakLength(3);
        System.out.println(birdTwo.getBeakLength());


    }
}
