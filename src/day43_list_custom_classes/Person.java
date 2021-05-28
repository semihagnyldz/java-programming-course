package day43_list_custom_classes;

public class Person {//this is a template
    String firstName;
    int age;
    //right now there is no behavior, just the data we have.
    public void speak(){ //this is the behavior//behavior of class
        System.out.println("person is speaking"); //both person1 and person2 use this behavior

    }
}
class People{
    public static void main(String[] args) {
        //create object of Person class-Instantiate Person class
        Person person1= new Person(); //person1 is the object of person class.
        person1.firstName="Bob"; // firstName is the method. //DATA
        person1.age= 33;//DATA
        System.out.println(person1.firstName);
        System.out.println(person1.age);
        person1.speak();//BEHAVIOR

        Person person2= new Person();
        person2.firstName= "Mike"; //DATA
        person2.age= 12;//DATA
        //person2.email="semihagn@gmail.com" yazamioruz cunku Person class de email yok...
        person2.speak(); //DATA---this speak is the method. but we have to add class name bc we didnt type static in the method.
        // static yazsaydik speak() call yapabilirdik, ama simdi person1.speak() yapabiliriz.

        //SUMMARY:
        //Person Class: DATA--firstName, age,
        //              BEHAVIOR--speak()




    }
}
