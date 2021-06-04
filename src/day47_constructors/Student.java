package day47_constructors;

public class Student {
    //no args constructor
    public Student(){
        System.out.println("no args constructor");
    }
    public Student(String name){
        System.out.println("name param constructor | name= "+name);

    }
    public Student(int age){
        System.out.println("her age is: "+age);
    }
    public Student (String name, int age){
        System.out.println("her name is: "+name+" and age is: "+age);
    }
}
