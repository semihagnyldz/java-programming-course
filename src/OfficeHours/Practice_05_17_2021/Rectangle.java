package OfficeHours.Practice_05_17_2021;

public class Rectangle {
    double height;
    double width;
    double area;
    //what these variable mean?: rectangle object has three variables/properties.these variable has default value 0.
    //bc these values are belong to the class that's why default value is 0
    public void setDimensions(double recHeights, double recWidth ){ //recHeignht and recWidth NEEds to be different than height and width.
        height=recHeights;
        width=recWidth;
        //area=height*width;



    }
    public double getArea(){
        area=height*width;
        return area;

    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}
