package day44_custom_classes;

public class AnimalObjects {
    public static void main(String[] args) {
        Animal a= new Animal(); //instantiate Animal class
        a.type="bird";//bu sekil print olmuo sout yazmak lazim
        System.out.println(a.type);//bu sekil print oluo
        a.speak();//bu sekil print oluo
        a.eat();// bu sekil print oluo
        a.eat("grass"); //eat(String food) method olmadan bu calismiodu.
        a.speak("turkish");
        //creating new Animal object- cheetahObj:
        Animal cheetahObj= new Animal();
        cheetahObj.type= "cheetah";
        System.out.println(cheetahObj.type);
        cheetahObj.eat("meat");
    }
}
