package day53_inheritance_tesla;

public class CarObjects {
    public static void main(String[] args) {
        ElectricCar ec1= new ElectricCar("tesla", "Model y", 48.000, 2021, 326);
        ec1.drive(50);
       // System.out.println(ec1);
       // System.out.println(ec1.make); cant do it bc make is private.
        //System.out.println(ElectricCar.make); wont work, make it public then wont
        // work again, need to do static to be able to work
        System.out.println(ec1.getMake());//instead of ec1.make, bc make private and also not static.
        System.out.println(ec1. getPrice());
        System.out.println(ec1.getModel());
        System.out.println(ec1.getRange());
        System.out.println(ec1.getYear());

        if( ec1. getPrice()> 100000){
            System.out.println(ec1.getMake()+"-"+ec1.getModel()+" is out of my budget");
        }else{
            System.out.println("purcahing: "+ec1.toString());
        }
        System.out.println(ElectricCar.getCount());

        ElectricCar ec2= new ElectricCar("CyberTruck","modelz",55.900, 2022, 456);
        System.out.println(ec2.toString());
        //System.out.println(ec2.getCount);
        System.out.println(ElectricCar.getCount());






    }
}
