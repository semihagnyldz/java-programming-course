package day32_arrays_split;

import java.util.Arrays;
//INTERVIEW QUESTIONS

public class SplitMethod {//how many word oldugunu bulabiliosun, split cok onemli method.
    public static void main(String[] args) {
        String word="java:python:selenium:html";
        String[] wordArray= word.split(":");
        System.out.println(Arrays.toString(wordArray));
        System.out.println("length of array: "+wordArray.length);

        String sentence="today I am coding java arrays";
        String[] splitWord=sentence.split(" ");//burda space e bakarsin ona gore split etcek ve sende kac word oldugunu bulabilirsin
        System.out.println(splitWord[0]);
        System.out.println("Number of words in sentence: "+splitWord.length);
        System.out.println("***********************");

        //OR
        for(String each:splitWord){
            System.out.println(each);
        }
    }
}
