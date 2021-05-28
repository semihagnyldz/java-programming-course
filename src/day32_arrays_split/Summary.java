package day32_arrays_split;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;

public class Summary {
    public static void main(String[] args) {
        String [] name= {"Hasan","Semiha","Meliha","Hafsa","Nagihan"};
        int[] age= {36, 36, 6, 4, 1};
        String[] gender= {"male", "female","female","female","female"};

        Arrays.sort(age); // age now already sorted
        //for printing you need to use for each loop ---simple way

        for(int sortingAge:age){

            System.out.print(sortingAge+" ");
        }
        System.out.println();
        //int i yanyana yazmak icin
        System.out.println(Arrays.toString(age));
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
        Arrays.sort(gender);
        System.out.println(Arrays.toString(gender));

        System.out.println(Arrays.binarySearch(age,1));
        System.out.println(Arrays.binarySearch(age, 36));
        System.out.println(Arrays.binarySearch(age,5));
        System.out.println(Arrays.binarySearch(age, 25));
        System.out.println(Arrays.binarySearch(name, "Semiha"));
        System.out.println(Arrays.binarySearch(gender, "male"));

        String scienceLearning="computational thinking can be seen as a critical tool to improve students' science understanding";
        String[] eachWord=scienceLearning.split(" ");
        System.out.println(eachWord[0]);
        System.out.println(eachWord[eachWord.length-2]);
        System.out.println(eachWord.length);
        System.out.println("nagihan kacinci index de binary ve for loop ile");
        System.out.println(Arrays.binarySearch(name, "Nagihan"));//3

        for(int i=0; i<name.length; i++){
            if(name[i].equalsIgnoreCase("nagihan")){
                System.out.println(i);//3
            }
        }
        System.out.println(Arrays.binarySearch(age, 6));//2
        for(int i=0; i<age.length; i++){
            if(age[i]==6){
                System.out.println(i);//2
            }
        }


    }
}
