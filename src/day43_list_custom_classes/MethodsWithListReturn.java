package day43_list_custom_classes;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;
import java.util.List;

public class MethodsWithListReturn {
    public static void main(String[] args) {
        //1 nanosecond= 1_000_000_000 of a second
        System.out.println(System.nanoTime());
//call the below method:
        List<Integer> mlnNums =getIntegerList();//getIntegerList i store ettik List<Integer>MLNnUMS IN ICINE
      System.out.println(mlnNums); // bu alttakiyle ayni seyi yapior. bunu yapmasak da olur.
        System.out.println(getIntegerList());
        //calling array method:
        getIntegerArray(); //bu sekil bisey return etmior, asagidaki gibi yazmak lazim
        //1. way:
        System.out.println(getIntegerArray());
        //2.way:
        int [] arr=getIntegerArray();
        System.out.println(arr);

    }
    public static List<Integer> getIntegerList (){
        List<Integer> nums=new ArrayList<>(); // burdaki new den sonra creating new object...!
        for (int i=0; i<=5; i++){
            nums.add (i);

        }
        return nums;
    }
    public static int [] getIntegerArray (){
        //declare empty array with size-1_000_001
        int[] nums = new int[10];
        for(int i=0; i<nums.length; i++){
            nums[i]=i;
        }
        return nums;
    }
}
