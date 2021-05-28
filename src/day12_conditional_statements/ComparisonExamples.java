package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed=45;
        int speedLimit= 55;
        System.out.println(currentSpeed>speedLimit);//false
        System.out.println(speedLimit<currentSpeed);//false
        System.out.println(speedLimit==currentSpeed);//false
        boolean isSpeeeding= currentSpeed>speedLimit;//false
        boolean isNotSpeeding=currentSpeed<speedLimit;//true
        System.out.println("Are you speeding = " + isSpeeeding);
        /*
        burda 2 yol kullandik comparison icin, line 7-8-9 ve 12. ama 12 daha common (yani boolean ile declare etmek lazim)
         */
        currentSpeed +=20;
        System.out.println("wonder if you speed = " + isNotSpeeding);

        double accountBalance= 250.25;
        double itemPrice= 100;
        System.out.println(accountBalance>=itemPrice);
        boolean iCanAfford= accountBalance>=itemPrice;
        System.out.println("do you have enough money?" +iCanAfford);

        //decrease balance by item price using shorthand operator
        accountBalance-=itemPrice;
        boolean isBroke= accountBalance<=0;//isbROKE BOOLEAN DIORUZ CUNKU BOOLEAN E STORE ETTIGIMIZ SEY COMPARISON ISTIYORUZ
        System.out.println("AM I BROKE:"+ isBroke);




    }
}
