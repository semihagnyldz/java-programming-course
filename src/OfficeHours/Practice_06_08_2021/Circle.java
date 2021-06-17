package OfficeHours.Practice_06_08_2021;

public class Circle extends Shape{
    double radius;
    double diameter;
    //generate the override methods:

    @Override
    public void calculateArea() {
        area=Math.PI*(radius *radius); //THESE ARE NOT METHODS,
    }

    @Override
    public void calculatePerimeter() {
        perimeter= 2* Math.PI*radius;
    }

   @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }


}
