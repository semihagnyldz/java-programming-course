package REPLT;
import java.util.Scanner;
public class ApartmentLeasing {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Cybertek Apartments!");
        System.out.println("Number of bedrooms you are interested:");

        int numberOfBedrooms = scan.nextInt();
        int startingPrice;
        //if (numberOfBedrooms < 4) {
            if(numberOfBedrooms==1) {
                startingPrice = 1100;
            }else if(numberOfBedrooms==2){
                startingPrice=1850;
            }else if(numberOfBedrooms==3) {
                startingPrice = 2345;
            } else {
                System.out.println("no such bedrooms available");
            }
            //System.out.println(startingPrice);

            }
        }

