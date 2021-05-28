package day16_switch_tenary;

public class Ternary_intro {
    public static void main(String[] args) {
        String result;
        int score= 55;
        /*if(score>60){
            System.out.println("pass");
        }else {
            System.out.println("fail");
        }

         */
        result= (score>60) ? "pass" : "fail";
        System.out.println("result = " + result);
    }
}
