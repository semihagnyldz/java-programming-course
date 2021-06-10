package day49_static;

public class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethods.displayMessage("wooden spoon");
        //StaticMethods.instanceMethod(); shows ERROR
        StaticMethods abc= new StaticMethods();
        abc.instanceMethod();//can be printed this way, no need to have sout.


    }
}
