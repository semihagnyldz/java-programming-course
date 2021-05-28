package day11_comparison_operators;
import java.util.Scanner;


public class BooleanComparisonOperators {
    public static void main(String[] args) {
        System.out.println(10==10);
        System.out.println(1000>100);
        System.out.println(985.44<98547.8);
        System.out.println(10<=11);
        System.out.println(5>=3);
        System.out.println(-100!=44);

        int a= 100;
        int b= 200;
        System.out.println(a==b);
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a<=b);
        System.out.println(a>=b);
        System.out.println(a!=b);

        boolean result;
        result=  5==5;
        System.out.println("result = " + result);
        result= 33>44;
        System.out.println("result = " + result);
        /* int result yazamayiz sadece boolean result yazabilriz cunku operator true yada false cevabi verecek. yani mesela <= in cevabi ya true ya da false olabilir.
        yada boolean result=2 yazamazsin, comparison operator kullanman lazim...
         */

        String city= "Holly Springs";
        System.out.println(city== "Holly Springs");
        System.out.println(city!="Boston");

        String name= "Nadir";
        boolean checkName= name=="Nadir";
        System.out.println("checkName = " + checkName);

        int age= 2;
        boolean toddler= age>3;
        System.out.println("toddler = " + toddler);
        Scanner scan=new Scanner (System.in);
        boolean weight=scan.nextBoolean();
    }
}
