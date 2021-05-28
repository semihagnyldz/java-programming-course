package OfficeHours.Practice_05_19_2020;

public class Birds { //birds is object
    //encapsulation: main thing is to prevent direct access to the variables, protecting the data, but not hiding completely..
    //the good language is that "preventing direct access"

    private String species;
    private boolean canFly;
    private double beakLength;
    private String planet= "earth"; //if i give the value to it, i would want people not to change it so there wont be any setter method, only getter method

    public String getPlanet(){
        return this.planet;
    }
    //private: cant access outside of the class, unless use the setter and getter methods


    public void setSpecies (String species){
        this.species=species; //this: reference to object for example, bird.setSpecies yerine.
    }
    public String getSpecies(){
        return species;
    }

    public void setCanFly (boolean canFly){
        this.canFly=canFly;
    }
    public boolean getCanFly (){
        return canFly;
    }
    public void setBeakLength (double beakLength){
        this.beakLength=beakLength;

    }
    public double getBeakLength (){
        return beakLength;
    }
}
