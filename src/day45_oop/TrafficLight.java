package day45_oop;

public class TrafficLight {//this is a template class
    String color;//one variable, null

   //this is a read only method, displays value of color variable
    public void showColor() {
        System.out.println("current color: "+color);


    }
    //this method updates the value of color variable
    public void changeColor(String newColor){
        System.out.println("changing color to "+newColor);
        color= newColor;

    }
}
