package day42_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("java"); words.add("html"); words.add("selenium"); words.add("a"); words.add("input"); words.add("title");
        printStrList(words);
        // 2nd way:
        printStrList(Arrays.asList("select","option","br","pyhton","sql","api"));

    }
    public static void printStrList (List<String> stringList){ //"java","apple","coffee","tea"
        for(String str:stringList){
            System.out.print(str+" ");
        }
        System.out.println();

    }
}
