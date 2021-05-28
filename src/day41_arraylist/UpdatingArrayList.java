package day41_arraylist;

import java.util.ArrayList;
import java.util.List;

public class UpdatingArrayList {
    public static void main(String[] args) {
        //car list
        List<String> myCars= new ArrayList<>();
        myCars.add("toyota");
        myCars.add("mazda");
        myCars.add("ford");
        myCars.add("Moskvich");
        myCars.add("tesla");
        myCars.add(0,"jeep");
        System.out.println(myCars);
        myCars.add(1,"lada");
        myCars.add(2,"yugo");

        //jeep, lada, yogo, toyoto, mazda, ford, moskvich, tesla
        System.out.println(myCars.toString());// print all cars
        String allCarsIn1St= myCars.toString();//saves all cars in 1 string variable

        myCars.set(0,"Lamborghini");
        System.out.println("after set: "+myCars.toString());
        //change 4 to honda..remove the mazda
        myCars.set(4,"honda");
        System.out.println("find honda: "+myCars.toString());
        System.out.println(myCars);
        /*
        how would you do that if myCars was array:
        myCars[4]= "Honda";
         */

        System.out.println("index of lada: "+myCars.indexOf("lada"));
        //we can also store this
        int teslaIndex= myCars.indexOf("tesla");
        System.out.println("tesla's index: "+teslaIndex);

       myCars.set(myCars.indexOf("ford"), "trabant");
        System.out.println("after set frod to trabant: "+myCars);
        //lada to bugatti
        if(myCars.contains("lada")){
            myCars.set(myCars.indexOf("lada"), "bugatti");
        }else{
            System.out.println("lada is not found");
        }
        System.out.println("after set bugatti: "+myCars);
        /*
        lamborghini to prius
        lada to lexus
        trabant to audi
        we can use loop instead of indexof everytime...
        if there are two lada forexample with loop every lada will be changed.
        but with indexof we need to find out all the lada's indexs.
         */
        for(int i=0; i<myCars.size(); i++){
            if(myCars.get(i).equalsIgnoreCase("lamborghini")){
                myCars.set(i, "prius");
            }else if(myCars.get(i).equalsIgnoreCase("toyota")){
                myCars.set(i,"lexus");
            }else if(myCars.get(i).equalsIgnoreCase("trabant")){
                myCars.set(i,"audi");
            }
        }
        System.out.println("after loop: "+myCars);

    }
}
