package day40_array_list;

import day38_methods.ArrayUtils;

import java.util.Arrays;

public class denem {
    public static void main(String[] args) {
        /*
       Write a program that will find out shortest words in the given string str.
       If there are few words that are evenly short, print them all. Use split method in order to split str string
       variable and create an array of strings. Print array with Arrays.toString() method. Sort array before printing.
Hint: Split values by comma: split(", ");
input: olive, fish, pursuit, old, warning, python, java, coffee, cat, ray
output: [cat, old, ray]
        */
        String arr = " semiha, cat, dog, hafsa, meliha, nagihan, can";
        String [] newArr= arr.split(",");
        String shortestWord=newArr[0];
        for(String currentWords:newArr) {
            if (currentWords.length() < shortestWord.length()) {
                shortestWord = currentWords;
            }
        }
        int countShortest=0;
        String count="";
        for(int i=0; i<newArr.length; i++){
            if(newArr[i].length()==shortestWord.length()){
                count+= newArr[i]+ ",";
            }
        }

        String[] shortestWords= count.split(",");
       Arrays.sort(shortestWords);
        System.out.println(Arrays.toString(shortestWords));


        }


    }

