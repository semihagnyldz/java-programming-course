package OfficeHours.Practice_06_08_2021;

public class Shape {//we will use this Shape class as parent class.
    double area;
    double perimeter;
    public void calculateArea(){
        System.out.println("Shape area");
    }
    public void calculatePerimeter(){
        System.out.println("Shape perimeter");

    }

    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }
}
