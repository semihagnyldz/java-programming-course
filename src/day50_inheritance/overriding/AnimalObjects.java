package day50_inheritance.overriding;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal animal= new Animal();
        animal.name="fluffy";
        animal.type="pitbull";

        animal.speak();

        Cat cat= new Cat();
        cat.speak();

        Dog dog= new Dog();
        dog.speak();
        }
    }

