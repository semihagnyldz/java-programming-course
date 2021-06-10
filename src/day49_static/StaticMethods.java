package day49_static;

public class StaticMethods {
    int num=10;
    static int count= 5;
    public static void displayMessage(String message){
        System.out.println("message: "+message);
       // System.out.println("num: "+num); num burda calismio cunku displaymessage methid is static but int num is nonstatic variable. bc it declared outof the method
        System.out.println("count: "+count); //this work bc count and method both are static.


    }
    public static void anotherStaticMethod(){
        System.out.println("another static method");
        displayMessage("wooden spoon");
    }
    public void instanceMethod(){
        System.out.println("instance method");
        System.out.println(num); //works
        System.out.println(count);//works
    }

}
