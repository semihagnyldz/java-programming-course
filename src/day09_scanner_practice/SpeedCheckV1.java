package day09_scanner_practice;

public class SpeedCheckV1 {
    public static void main(String[] args) {
        int speedLimit=55;
        int currentLimit=75;
        int overTheLimit= currentLimit-speedLimit;
        System.out.println("You are driving "+overTheLimit+ " mph over the limit. Slow down!");

        /*
        speedlimit=55
        currentlimit=75
        overTheLimit= currentSpeed-speedLimit
        you are driving 20 mph over the limit.Slow down!
         */
    }
}
