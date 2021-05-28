package day46_encapsulation;

public class Car {
    // String model; make this private"
    private String model; //private is an access modifier, can be only accessed in SAME class
    private int year; //THIS IS INSTANCE VARIABLE
    private int mileage;
    //all above data are encapsulated/hidden instance variables

    //setter method for model
    public void setModel (String carModel){
        //model can be accessed in here bc they are in the same class
        model= carModel;

    }

    //getter method for model:
    public String getModel () {
        return model; //now we fully completed the encapsulation of model.
    }
    //setter for year
    public void setYear (int year){ //NEWYEAR IS PARAMATER VARIABLE
        //year=newYear;
        this.year= year; //this.year is the instance variable not the parameter
    }
    public int getYear (){
        return year;
    }

    public void setMileage (int mileage){
        this.mileage=mileage;
    }
    public int getMileage (){
        return mileage;//this.mileage also works.
    }



}
