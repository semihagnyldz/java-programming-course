package day10_shorthand_operator;

public class ShortHandOperators {
    public static void main(String[] args) {
        int cars= 10;
        System.out.println("cars = " + cars);
        //cars= cars+2;

        cars+=2;
        System.out.println("cars = " + cars);
        cars+=5;
        System.out.println("cars = " + cars);
        cars-=10;
        System.out.println("cars = " + cars);
        int electriccars=15;
        
        cars+=electriccars;
        System.out.println("electriccars = " + electriccars);
        System.out.println(cars);
        String word= "java";
        System.out.println("word = " + word);
        word= word + " programming";
        System.out.println("word = " + word);
        word+="is fun";
        System.out.println(" word = " + word);
        String selenium= " but selenium is more fun.";
        word+=selenium;
        System.out.println("selenium = " + selenium);
        System.out.println(word);
        char letter= 'F';
        System.out.println("letter = " + letter);
        word+=letter;
        System.out.println(word);
        letter+=4;
       // word+=letter;
        System.out.println(word);
        double parkingFee= 7.50;
        System.out.println("parkingFee = " + parkingFee);
        parkingFee/=2;
        System.out.println("earlybird parking fee= "+parkingFee);
        parkingFee-=3.75;
        System.out.println("weekend parking = " + parkingFee);




    }
}
