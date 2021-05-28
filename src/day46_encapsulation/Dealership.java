package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car myCar= new Car();
        //myCar.model= gives error

        myCar.setModel("jeep");
        //how to read the model?:
        System.out.println("myCar model= "+myCar.getModel());

        myCar.setYear(2020);
        System.out.println("myCar year is: "+ myCar.getYear());

        myCar.setMileage(1000);
        System.out.println("myCar milegae is: "+myCar.getMileage());

        System.out.println(myCar.toString());

        Car alfaRomeo= new Car();
        alfaRomeo.setModel("Alfa Romeo Giulia");
        alfaRomeo.setYear(2021);
        alfaRomeo.setMileage(50000);
        //so above we set all the data

        //now we will get it:
        System.out.println("Model= "+alfaRomeo.getModel());
        System.out.println("year: "+alfaRomeo.getYear());
        System.out.println("mileage: "+alfaRomeo.getMileage());
        //all the info getting in one shot:
        System.out.println(alfaRomeo.toString());



        }


    }

