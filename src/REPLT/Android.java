package REPLT;
import java.util.Scanner;
public class Android {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Please enter your version number: ");
        double version= input.nextDouble();
        if(version==1.6){
            System.out.println("Donut");
        } else if(version==2.1){
            System.out.println("eclair");
        }else if(version==2.2){
            System.out.println("froyo");
        }else if(version==2.3){
            System.out.println("gingerbread");
        }else if(version==3.1){
            System.out.println("honeycomb");
        }else if(version==4.0){
            System.out.println("ice cream sandwich");
        }else if(version==4.1){
            System.out.println("jelly bean");
        }
            /*
            1.5 - Cupcake
1.6 - Donut
2.1 - Eclair
2.2 - Froyo
2.3 - Gingerbread
3.1 - Honeycomb
4.0 - Ice Cream Sandwich
4.1 - Jelly Bean
4.4 - KitKat
5.0 - Lollipop
8.0 - Oreo
9.0 - Pie
             */
    }
}
