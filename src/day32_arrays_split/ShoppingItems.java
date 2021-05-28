package day32_arrays_split;

import java.util.Arrays;

public class ShoppingItems {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println("-----Find the index of 'gloves' in items array-----");
        System.out.println(items[2]);
        System.out.println(Arrays.binarySearch(items, "Gloves"));

        //with loops
        for(int i=0; i<items.length; i++){
            if(items[i].equals("Gloves")){
                System.out.println("Gloves is found at indexOf: "+i);
            }
        }
        boolean iPadExists=false;
        for(String findGloves:items){
            if(findGloves.equalsIgnoreCase(("iPad"))){

               iPadExists=true;
               break;
            }

        }
        System.out.println("for each loop ileyaptik, bu items array de glove var mi die bakioruz: "+iPadExists);
        if(iPadExists){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
//TEK TEk item lari price ile yazicaz:
        //ama for each ile yapamayiz..yani zor olur...we need i bc iteration yapmasini istioruz, for each specific data ya bakio...cok uzun olur for each ile.
        System.out.println("----Print a report of each shopping item");
        for(int i=0; i<items.length; i++) {//buraya prices.lemgth de yapabilirdin, hepsinin size i ayni...
            System.out.println("Items: "+items[i]+" *****Prices: "+prices[i]+" *****Items IDs: "+itemIDs[i]);
        }
        for(int i=0; i< items.length; i++) {
            if(items[i].equalsIgnoreCase("jacket")){
                System.out.println(i); // bu index i  verior
                System.out.println(items[i]);// bu jacket in ayrintilarini vercek
                System.out.println(items[i]+"- $ "+itemIDs[i]+" - "+prices[i]);
                break; //stop searching after found the "jacket"
            }
        }
    }
}
