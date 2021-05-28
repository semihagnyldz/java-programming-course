package day44_custom_classes;

public class Animal {
    String type;
    public void eat(){
        System.out.println("eating");

    }
    public void speak(){
        System.out.println("speaking");

    }
    public void eat(String food) {
        System.out.println("eating "+food);
    }
    public void speak(String language){
        System.out.println("speaking "+language);
    }
}
