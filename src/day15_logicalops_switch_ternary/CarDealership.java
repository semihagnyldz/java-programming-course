package day15_logicalops_switch_ternary;

public class CarDealership {
    public static void main(String[] args) {
        double budget= 5000;
        String model= "Toyota";
        double carPrice= 4500;
        /*
        1. needs to be within budget
        AND
        2. needs to be "tOYOTA" OR"HONDA" OR "TESLA"
         */
        boolean available= carPrice<=budget;
        if(available && model.equals("Toyota") || model.equals("Honda") || model.equals("Tesla")){
            // && will be evaluted first
            System.out.println("I can purchase!");
        }else{
            System.out.println("I wont buy!");
            //! reverses the result.
        }
    }
}
