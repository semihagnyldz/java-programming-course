package day16_switch_tenary;

public class Apartment2 {
    public static void main(String[] args) {

        int numberOfBedrooms=0;
        double startingPrice=0;
        String selection="";
        //yukardaki variable lari initiliaze etmeyince print yapmio...
        switch (numberOfBedrooms) {// here we ask what is the numberOfbedrooms means we are checking.
            case 0: // lets say if it is o nemberof bedroom selected this case will run.

                startingPrice = 1454;
                selection= "Studio apartment";
                break; // this means exit the switch only, not main method or class.
            case 1:
                //System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                selection= "one bedroom apartment";
                break;
            case 2:
                //System.out.println("Two bedrooms apartments selected");
                startingPrice = 2899;
                selection= "two bedrooms apartments";
                break;
            default:
                System.out.println("Apartment not selected");
                //return; means exit main method

        }
        System.out.println("your selection is: "+selection);
        System.out.println("starting price is : "+startingPrice);

    }
}
