package day41_arraylist;

import java.util.ArrayList;

public class CitiesList {
    public static void main(String[] args) {
        //declare arraylist.
        ArrayList<String> cities= new ArrayList<>();
        // add cities to arraylist--add method
        cities.add("North Carolina"); //0 index
        cities.add("Istanbul");//1
        cities.add("New York");//2
        cities.add("Boston");//3
        cities.add("Bingol");//4
        //add Uskudar to the 0 index.
        cities.add(0, "Uskudar");
        System.out.println(cities);
        System.out.println("first city: "+ cities.get(0));
        //find last index using size()-1;
        System.out.println("last city: "+cities.get(cities.size()-1));
        //print count of items in arraylist:
        System.out.println("count of items: "+ cities.size());
        int size=cities.size();
        System.out.println("there are "+size+" cities in the list");

        //for loop and print all values in same line
        for(int i=0; i<cities.size()/2; i++){
            System.out.print(cities.get(i)+" ");

        }
        //for each loop
        for(String city: cities){
            System.out.println(city+" ");
        }
       // System.out.print(cities);
        //remove using index:delet the value at index 3
        System.out.println();
        cities.remove(0);
        cities.remove("Bingol");
        System.out.print("after removing uskudar: "+cities);
        System.out.println();
        //remove everything:
        cities.clear();
        //make sure it is clear:
        //1-sout:
        //printing also means spit it out.

        System.out.println("is cities clear:" +cities);
        //2-using isEmpty();
        if(cities.isEmpty()){
            System.out.println("list is empty");
        }
        //3-check size()==0
        if(cities.size()==0){
            System.out.println("list is empty");
        }

    }
}
