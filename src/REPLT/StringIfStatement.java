package REPLT;
import java.util.Scanner;

public class StringIfStatement {
    public static void main(String[] args) {
        String name;
        Scanner input= new Scanner(System.in);
        System.out.println("what is your name: ");
        name=input. next();
        if(name.equals("Chen")){
            System.out.println("teacher");
        }else {
            System.out.println("student");
        }
        /*
        The variable name holds a String user input

Write a conditional statement that will determine if the person is a student or teacher.

If name is equal to "Chen", print "teacher"
For any other input, print "student"
Examples:

input: Chen
output: teacher
input: Chen
output: teacher
input: Faa
output: student
         */
    }
}
