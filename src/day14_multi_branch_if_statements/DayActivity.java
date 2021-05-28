package day14_multi_branch_if_statements;
import java.util.Scanner;

public class DayActivity {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("what is the weather today?");
        String weather;
        weather=input.next();
        if(weather.equals("sunny")){
            System.out.println("go to park");
        } else if(weather.equals("rainy")){
            System.out.println("stay home");
        } else if(weather.equals("snowy")){
            System.out.println("clean your car");
        }else if(weather.equals("windy")){
            System.out.println("get ready for power lost");
        }else{
            System.out.println("just keep coding java");
        }


    }
}
