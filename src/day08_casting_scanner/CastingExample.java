package day08_casting_scanner;

public class CastingExample {
    //not so much important topic maybe once you do converting!
    public static void main(String[] args) {
        byte num1=100;
        short num2= num1;
        int num3= num1; //because int is bigger than short we do not need to type int num3= (int) num1

        float num6= 124.4F;
        double num7= num6; //double is larger, it will automatically convert num6 into num7.

        int num8= 3456;
        double num9= num8;

        double num10= 4859;
        int num11= (int)num10;
        double a= 1000;
        int b= (int) a;


        System.out.println(num8);
        System.out.println(num9); //num9 double oldugu icin .0 seklinde cikio sonuc ama int de whole number gosterio sadece decimal yok.

        //byte-short-int-long-float-double

        int num15= 55;
        byte num25= (byte) num15;
        System.out.println(num25);
        long num35= 4444L;
        int num45= (int)num35;
        System.out.println(num45);

        double num65= 55.3;
        float num75= (float) num65;
        System.out.println(num65);
        System.out.println(num75);

        double num80= 100.5;
        int num90= (int)num80;
        System.out.println(num80);
        System.out.println(num90);
        int num100= 200;
        byte num101= (byte)num100;
        // byte limit is 127
        System.out.println(num101); //burda 200 vermior output cunku limit for byte is 127, 200 127 range in disinda oldugundan bize baska rakam vercek.

        char letter= 'a'; //97
        int numberletter= letter;
        System.out.println(numberletter);




    }
}
