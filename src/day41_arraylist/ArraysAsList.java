package day41_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAsList {
    public static void main(String[] args) {
        List <Integer> nums= Arrays.asList(23,1,34,54,654);// immutable list size cannot be modified but we can modify values.
        //Arrays.asList is used instead of add. method multiple times. not to type add add add multiple times.
        System.out.println("nums= "+nums);
       // doesnot work: nums.add(100); and nums.remove(0)

        List<Integer> numsList= new ArrayList<>(Arrays. asList(4,2,4,23,5344,100)); //simdi add remove clear yapabilirim.
        // normalde array list de remove add clear kullanamioruz. ama arrays.aslist yapinca yapabilirioz.
        numsList.add(33);
        numsList.add(56);
        System.out.println("nums list: "+numsList);
        numsList.remove(3); //removing number 23, index 4
        System.out.println("after removing index 3: "+numsList);
        numsList.remove(new Integer(23));//removing number 23, index 3
        //example, add coffee, tea, monster, red bull
        List<String> drinkWithCaffeine= new ArrayList<>(Arrays.asList("coffee","tea","monster","red bull","coke", "pepsi","mdew", "kambucha","celsius"));
        System.out.println(drinkWithCaffeine);
                int caffeineAmount= 0;
                for(String drink:drinkWithCaffeine){
                    if(drink.equals("monster")||drink.equals("red bull")|| drink.equals("celsius")){
                        caffeineAmount=150;
                        System.out.println(drink+"-->"+caffeineAmount);
                    }else if(drink.equals("coffee")|| drink.equals("kambucha")){
                        caffeineAmount=112;
                        System.out.println(drink+"-->"+caffeineAmount);
                    }else if(drink.equals("tea")||drink.equals("coke")||drink.equals("pepsi")||drink.equals("mdew")){
                        caffeineAmount=35;
                        System.out.println(drink+"-->"+caffeineAmount);
                    }
                }
                //with switch
        for (String drink: drinkWithCaffeine){
            switch (drink){
                case "monster": case "red bull": case "celsius":
                    caffeineAmount=150;
                    System.out.println(drink+"-->"+caffeineAmount);
                    break;
                case "coffee": case "kambucha":
                    caffeineAmount=112;
                    System.out.println(drink+"-->"+caffeineAmount);
                    break;

            }
        }





    }
}
