package day50_inheritance;

public class Student extends Person{
    char studentClassName;
    public void study(String topic){
        System.out.println(name+ "student is studying "+topic);
    }
    public void school(){
        System.out.println("student is going to ");
    }
}
