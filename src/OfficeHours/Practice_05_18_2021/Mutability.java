package OfficeHours.Practice_05_18_2021;

import java.util.Arrays;
import java.util.Locale;

public class Mutability {
    public static void main(String[] args) {
        String one= "java";
        String two=one;
        System.out.println("one = " + one);
        System.out.println("two = " + two);
        String three= two.toUpperCase(Locale.ROOT);
        System.out.println("three = " + three);
        System.out.println(two.toUpperCase() ==three);
        System.out.println(two.toUpperCase(Locale.ROOT).equals(three));
        one=one.substring(2);
        System.out.println(one);
        System.out.println(two);

        String a= new String("anything");
        String b= a;
        b=b.toUpperCase(Locale.ROOT);
        System.out.println(a);
        System.out.println(b);

        int [] arr1= {1,2,3};
        int [] arr2= arr1;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        arr1[0]=100;
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));



    }
}
