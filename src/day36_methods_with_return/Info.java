package day36_methods_with_return;

import java.util.Random;

public class Info {
    public static void main(String[] args) {
        fullName();
        isMarried();
        getAge();
        // yukarisi bisey vermior, cunku bunlar return yapiolar yani println de yazman lazim!!
        System.out.println(fullName());
        System.out.println(isMarried());
        System.out.println(getAge());
        System.out.println(getRandomYear());
        String name= fullName();
        boolean married= isMarried();
        int age= getAge();
        System.out.println(name);
        System.out.println(age);
        System.out.println(married);
        int year=getRandomYear();
        System.out.println(year);
    }
    public static String fullName(){
        return "Mike Smith";
    }
    public static boolean isMarried(){
        return false;
    }
    public static int getAge(){
        return 35;
    }
    public static int getRandomYear(){
        Random random=new Random();
        int randomYear=random.nextInt(2021);
        return randomYear;
    }
}
