package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1= new Student();
        Student st2= new Student();

        Student st3= new Student("Semiha");
        Student st4= new Student("Meliha");

        Student st5= new Student ("semiha", 36);
        System.out.println(st5);
    }

}
