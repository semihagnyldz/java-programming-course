package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1="java";//this is in string pool
        String word2= "java"; //re-use from string pool.
        String word3= new String("java");//creating in HEAP,  outside String pool
        String word4= new String("java"); // creating in the HEAP, outside String pool

        System.out.println(word1==word2); //true
        System.out.println(word1==word3);//false bc word3 is not in the pool.
        System.out.println(word3==word4);//false

        System.out.println(word1.equals(word3));//true
        System.out.println(word1.equals(word3));//true
        System.out.println(word3.equals(word4));//true
    }
}
