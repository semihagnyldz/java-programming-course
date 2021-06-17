package OfficeHours.Practice_06_07_2021.WalmartPractice;

import java.util.ArrayList;

public class WalmartTest {
    public static void main(String[] args) {
        WalmartStore storeOne= new WalmartStore("NC"); //THIS IS FOR CONSTRUCTOR 1.
        System.out.println(storeOne);

        Item pen= new Item("pen",1.4, 10 );
        Item hat= new Item("hat", 3.5, 20);
        ArrayList<Item> allItems= new ArrayList<>();
        allItems.add(pen);
        allItems.add(hat);

        WalmartStore storeTwo= new WalmartStore("DC", allItems);
        System.out.println("storetwo: "+storeTwo);
    }
}
