package REPLT;

public class CountHi {
    public static void main(String[] args) {
/*
Print out the number of times that
the string "hi" appears anywhere in the given string. Only lowercase "hi" should be counted.
 */
        String str= "hiabchixyzhi";

        int count=0;
        for(int i=0; i<str.length()-1; i++){ //lengths 12 (1 den baslio);
            // index o dan baslio yani= 12-1=11=length()-1=last index

         if((""+str.charAt(0)+str.charAt(1)).equals("hi")){
             count++;
         }

         }
        System.out.println(count);
        }
        //System.out.println(str.substring(0,2).contains("hi"));

        }

    //}


