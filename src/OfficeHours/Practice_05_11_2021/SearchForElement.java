package OfficeHours.Practice_05_11_2021;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchForElement {
    public static void main(String[] args) {
        ArrayList<String > list= new ArrayList<>(Arrays.asList("one","two","three","two"));
        System.out.println(findIndex(list, "two", 2));


    }

    /**
     *
     * @param words--List of elements given
     * @param element--the lement that we are looking for
     * @param startIndex--the index number where the search starts from
     * @return--the method returns the index where the lement is foubd in the given Arraylist...
     */
    public static int findIndex (ArrayList<String>words, String element, int startIndex){
        int index=-1; //-1 is default value...bc 0 is a valid index. thats why we give it -1.
        for(int i=startIndex; i<words.size(); i++){
            if(words.get(i).equals(element)){
                index=i;//return i also works
                break;
            }
        }
        return index;
    }
}
