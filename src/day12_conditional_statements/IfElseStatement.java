package day12_conditional_statements;

public class IfElseStatement {
    public static void main(String[] args) {
        if(10<5){
            System.out.println("Condition is true");
            // in java we dont have if then...only if
        }else{
            System.out.println("Condition is false");

            byte age= 7;
            if(age>=18){
                System.out.println("Eligible to vote");
                System.out.println("Age is greater or equal to 18");

            }else{
                System.out.print("Not eligible to vote- ");
                System.out.println("Age is less than 18");
                /*
                if(boolean condition){
                code to run if condition is TRUE
                }else{
                code to run if condition is FALSE
                 */
            }
        }
    }
}
