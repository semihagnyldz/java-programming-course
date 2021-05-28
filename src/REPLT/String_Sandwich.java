package REPLT;
import java.util.Scanner;
public class String_Sandwich {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        if(str.contains("bread")){
            int firstBread= str.indexOf("bread");
            if(str.substring(firstBread+5).contains("bread")){
                int secondBread=str.lastIndexOf("bread");
                if(firstBread!=secondBread){
                    System.out.println(str.substring(firstBread+5,secondBread));
                }

            }else{
                System.out.println("nothing");
            }

        }else{
            System.out.println("nothing");
        }
    }
}
