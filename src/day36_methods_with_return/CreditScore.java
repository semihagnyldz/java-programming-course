package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
       checkEligible(650);
       checkEligible(800);
        // gives error: System.out.println(checkEligible(500));
        System.out.println(getCreditScore());
        System.out.println("Score= "+getCreditScore());
        getCreditScore();//not printing but we can store this into sth. we can say:
        int score=getCreditScore(); //you are assigning your method.
        System.out.println(score);
    }
    public static void checkEligible(int creditScore){
        if(creditScore>=700){
            System.out.println("you are eligible for this lease");
        }else{
            System.out.println("sorry, you are not eligible for this lease");
        }
    }
    public static int getCreditScore() {
        return 800;
    }
}
