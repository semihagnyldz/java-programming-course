package OfficeHours.Practice_06_08_2021;

public class Rectangle extends Shape{
    double length;
    double width;

    @Override
    public void calculateArea() {
        area=length*width;
    }

    @Override
    public void calculatePerimeter() {
        perimeter= 2* (length+width);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

    //ps: c extends b and b extends a, c will have a data.

}
