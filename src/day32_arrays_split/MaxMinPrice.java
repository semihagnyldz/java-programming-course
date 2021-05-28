package day32_arrays_split;

import java.util.Arrays;

public class MaxMinPrice {
    public static void main(String[] args) {
        String[] items  = {"Shoes", "Jacket","Gloves", "Airpods", "iPad", "iphone 11 case" };
        double[] prices = {99.99, 150.0, 9.99, 250.0 , 439.50, 39.99};
        int[] itemIDs =   {12345 , 12346, 12347, 12348, 12349, 12350};

        System.out.println(Arrays.toString(items)); // no loop is needed for this
        System.out.println(Arrays.toString(prices));
        System.out.println(Arrays.toString(itemIDs));
        double maxPrice= prices[0];
        int indexOfMaxPrice=0;
        for(int i=0; i<prices.length; i++){
            System.out.println(prices[i]);
            if(prices[i]>maxPrice){
                maxPrice=prices[i];
               indexOfMaxPrice=i;
            }
        }
        System.out.println("max price is: "+ maxPrice);
        System.out.println(items[indexOfMaxPrice]+" "+prices[indexOfMaxPrice]+" "+itemIDs[indexOfMaxPrice]);



        for(int i=0; i<items.length; i++){ //bu loop un icinde index i ariycak, max price icin..mesela burda 4 u bulmasi lazim en pahali ipad cunku
           // if (prices[i]>maxNumber){
                //prices[i]=maxNumber;

            }
        }
        //System.out.println(maxNumber);

    }

