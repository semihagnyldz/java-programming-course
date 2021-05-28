package day06_arithmetic_operators;

public class MoreMathOperators {
    public static void main(String[] args){
      int toyotas= 431;
      int hondas= 233;
      int vws= 2,teslas= 20, nissans= 1, bmws= 155;

        int totalCarsInParking= toyotas+hondas+vws+teslas+nissans+bmws;
        System.out.println("There are "+ totalCarsInParking + " cars in the parking");

        String pizza= "hawaiian";
        int slices= 8;
        int people= 4;
        int slicesPerPerson= slices/people;
        System.out.println("there are "+ slicesPerPerson+ " slices per person");
        System.out.println("We ordered "+pizza+ " pizza with "+ slices+" slices," + people+ " people ate 2 slices each");


    }
}
