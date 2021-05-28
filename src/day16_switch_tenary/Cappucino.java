package day16_switch_tenary;

public class Cappucino {
    public static void main(String[] args) {
        String size= "venti"; // in starbucks the size could be tall, grande and venti.
        double price=0;
        double calories=0;

        switch(size) {
            case "tall":
                System.out.println("Cappuccino Tall size please");
                price= 3.69;
                calories= 90;
                break;
            case "grande":
                System.out.println("Grande cappuccino please");
                price= 3.99;
                calories=120;
                break;
            case "venti":
                System.out.println("Venti cappuccino please");
                break;
            default:
                System.out.println("We don't serve this "+size+ "of cappuccino here");

        }

        System.out.println("Your total is: "+price);
        System.out.println("You will consume "+calories);

    }
}
