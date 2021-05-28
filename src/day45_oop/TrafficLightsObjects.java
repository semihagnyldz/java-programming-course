package day45_oop;

public class TrafficLightsObjects {
    public static void main(String[] args) {
        //create traffic light object
        TrafficLight abc = new TrafficLight();
        //controlling the variable thorugh a method: methoda yaz! yani sole deil:
      //  abc.color= "red"; //bu sekil de variable i method ile coktrol etmis olmuoruz.
        //we will assign the value of color using method of the class.

        //call method to access the variable
        abc.changeColor("red");
        abc.changeColor("green");
        abc. showColor();

        TrafficLight abc2= new TrafficLight();
        abc2.changeColor("yellow");
        abc2.showColor();
        //methods also controls the valid variables.

    }
}
