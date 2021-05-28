package Assignments;

public class Apartmant {
    public static void main(String[] args) {
        String address= "621 Ivy Arbor Way, Holly Springs, NC, 27540";
        String nameOfTheOwner= "Semiha Gun-Yildiz";
        byte numberOfUnits= 5;
        short averageSizeOfTheUnit= 1100;
        float monthlyRentAmount= 3500;
        byte numberOfWashersAndDriers= 2;
        boolean hasPetsAllowed= false;
        boolean hasAPool= false;
        String lengthOfLease= "12 months";
        byte totalNumberOfResidentsInBuilding= 25;
        String phoneNumberOfOwner= "617-415-8025";
        boolean isNearAGasStation= true;
        float numberOfFloors= 3;
        byte hasABasement= 0;
        boolean hasAvailableUnitsForRent= true;
        boolean hasAirConditioner= true;
        byte numberOfParkingSpaces= 10;
        byte hasWheelChairAccess= 0;
        String numberOfReviewStars= "5/5";

        System.out.println("Monthly rent after 3 years: "+(monthlyRentAmount- (monthlyRentAmount*10/100)));
        System.out.println("Monthly rent after 6 years:"+(monthlyRentAmount-(monthlyRentAmount*20/100)));
        System.out.println("Average number of residents per unit: "+totalNumberOfResidentsInBuilding/numberOfUnits);
        System.out.println("Average number of parking spots: "+numberOfParkingSpaces/numberOfUnits);
        System.out.println("Average number of units per floor: "+numberOfUnits/numberOfFloors);
        /*


  -
            - Average number of units per floor ( units / number of floors)
         */
    }
}
