package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
       int bonus= 0;
        double saleAmount= 3000.0;
        boolean extrabonus= saleAmount<=2000;
       // if(saleAmount<=2000){
        if(extrabonus){
            bonus+=50;
            System.out.println("Good job, you qualified for bonus!: "+bonus);
        }else{
            bonus+=100;
            System.out.println("Great job, you are qualified for full bonus"+ bonus);
        }
    }
}
