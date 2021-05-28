package day07_arithmetic_operators_casting;

public class StringConcat {
    public static void main(String[] args){
        System.out.println("java" +(5+3));
        System.out.println(5+ (3+ "java"));
        //ilk left to right gidio ama parantezx varsa ilk parantezi yapio.
        System.out.println("hello"+1+2+3); //hello123
        System.out.println("hello"+1+(2+3)); //hello15
        System.out.println("hello"+(1+2+3)); //hello6
        System.out.println(1+"hello"+(2+3)); //1hello5
        System.out.println(1+(2+3)+"hello"); //6hello
        String str1= "hello";
        String str2= " friends";
        System.out.println(str1+str2);
        int num1= 7;
        int num2= 8;
        System.out.println(num1+" "+ num2);
        System.out.println(num1+""+num2);

        //when we plus between chars, it will add numbers from ASCII table ex:
        char char1= 'a'; //a=97
        char char2= 'b';//b=98
        System.out.println(char1+char2);
        System.out.println(char1+""+char2);


    }
}
