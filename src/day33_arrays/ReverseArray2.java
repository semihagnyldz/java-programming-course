package day33_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray2 {
    public static void main(String[] args) {
        //we can use reverse to get the result instead looping
        int num[]={5,10,4,100};
        System.out.println("before swap: "+ Arrays.toString(num));
        int temp=num[0];
        num[0]=num[3];
        num[3]=temp;
        System.out.println("after 1st and last swap: "+Arrays.toString(num));

        int temp1= num[1];
        num[1]=num[2];
        num[2]=temp1;
        System.out.println(Arrays.toString(num));

        int[] nums2={5,10,4,100};
        System.out.println("*****************");
        String [] words={"java", "html","js","ruby","css"};
        //reverse it without using additional array:
        System.out.println("before reverse: "+Arrays.toString(words));
        for(int i=0, j=words.length-1; i< words.length/2; i++, j--){
            String tempWord= words[i];
            words[i]=words[j];
            words[j]= tempWord;
        }
        System.out.println("after reverse= "+Arrays.toString(words));

    }
}
