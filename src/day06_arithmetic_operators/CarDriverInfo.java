package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main( String[] args){
        String carModel= "Jeep";
        String driverName= "Semiha";
        String licenseNum= "S48392473857";
        short speed= 140;
        boolean isAutomatic= true;
        char licenseClass= 'D';

        System.out.println("Car Model: "+carModel);
        System.out.println("Driver Name: "+driverName);
        System.out.println("License Number: "+licenseNum);
        System.out.println("Speed: "+speed+ " mph");
        System.out.println("Is Automatic: "+isAutomatic);
        System.out.println("Licence Class: "+licenseClass);
// char + boolean yapamazsin...mesela println(licenseClass+isAutomatic) olmaz...araya bisey koyman lazim, elma ve armit toplanmaz
        // println(licenseClass+" "+isAutomatic) olur...1 tane string olsa it works.
        //boolean+boolean not work
        //if one of them string then will work






    }
}
