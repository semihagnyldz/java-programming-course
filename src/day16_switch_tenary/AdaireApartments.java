package day16_switch_tenary;

public class AdaireApartments {
    public static void main(String[] args) {
        int numberOfBedrooms=2;
        double startingPrice=0;
        switch (numberOfBedrooms) {// here we ask what is the numberOfbedrooms means we are checking.
            case 0: // lets say if it is o nemberof bedroom selected this case will run.
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break; // this means exit the switch only, not main method or class.
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedrooms apartments selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println("Apartment not selected");

        }
    }
}
