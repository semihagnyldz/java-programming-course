package day30_arrays;

import java.util.Locale;

public class StudentArray {
    public static void main(String[] args) {
        String [] student1= new String [5];
        student1[0]= "AD12334";
        student1[1]= "Semiha";
        student1[2]= "Yildiz";
        student1[3]= "B22";
        student1[4]= "345-756-9000";

        String [] student2= {"AS65789", "Meliha", "Yildiz", "B22","789-453-1222"};
        System.out.println("student1 id: "+ student1[0]);
        System.out.println("student1 firstname: "+ student1[1]);
        System.out.println("student1 lastname: "+student1[2]);
        System.out.println("student data length: "+student1.length);
        if(student1.length==5){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        if(student1.length==student2.length){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        System.out.println((student1[1]+" "+student1[2]).toUpperCase(Locale.ROOT));
        String mobileNum= student1[4]; //mobilenum is normal variable
        System.out.println(mobileNum.length());
        System.out.println(mobileNum.startsWith("202"));

    }
}
