package OfficeHours.Practice_05_17_2021;

public class rectangleObject {
    public static void main(String[] args) {
        Rectangle rectangle= new Rectangle();
        System.out.println(rectangle.getArea());//0.0 bc didn't set the dimensions yet
        rectangle.setDimensions(5,3);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle);

        Rectangle rectangle1= new Rectangle();
        System.out.println(rectangle1.getArea());
    }
}
