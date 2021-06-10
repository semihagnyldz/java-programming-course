package day48_constructors_static.static_examples;

public class CalculatorTest {
    public static void main(String[] args) {
        //if it is static no need for object
        //add is a static method, can be called using Classname.staticMethodName
        Calculator.add(5,3); //directly prints like this output is 8

        //Calculator.multiply(5,3) ---does not work bc it is not static
        //need to create a object for Calculator:
        Calculator cl1= new Calculator();
        cl1.multiply(5,3);//now it prints like this no need to sout.


    }
}
