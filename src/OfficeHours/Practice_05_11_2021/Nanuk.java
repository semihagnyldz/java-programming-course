package OfficeHours.Practice_05_11_2021;

import java.util.ArrayList;

public class Nanuk {
    public static boolean nanuk(ArrayList<String> r, int way_stones, int boast){
        int foodFound=0;
        for(String each:r){
            if(each.equals("nanuk")){
                way_stones--;
            }else {
                foodFound+= Integer.parseInt(each); //take string to a int value.
            }
        }
        return way_stones>=0 && foodFound>=boast;
    }
}
