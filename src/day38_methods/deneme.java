package day38_methods;
import java.util.Scanner;
public class deneme {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String s = inp.next();
        person(s) ;
    }

    public static void person(String info) {
        //your code here
        String [] splitS=info.split(",");
        System.out.println("person name: "+splitS[0]);
        System.out.println("last name: "+splitS[1]);
        System.out.println("age: "+splitS[2]);





    }
}
