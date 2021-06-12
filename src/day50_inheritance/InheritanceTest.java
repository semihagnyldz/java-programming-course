package day50_inheritance;

public class InheritanceTest {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.name="Semiha";
        p1.age=36;
        p1.talk();
        p1.walk();
        p1.work("SDET");

        Teacher t1= new Teacher();
        t1.teacherID= 1234;
        t1.name="seyma";


        Student stu1= new Student();
        stu1.work("at school");
        stu1.study("physics");
        stu1.name="semiha";
        stu1.age= 36;

    }
}
