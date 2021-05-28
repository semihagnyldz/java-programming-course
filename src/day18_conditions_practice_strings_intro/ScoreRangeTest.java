package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score=60;
        /*
        (score >=1 && score <= 40)
score:
    1-40   -> D
    41-60  -> C
    61-90  -> B
    91-100 ->A...
    else
        'invalid score'
         */

        if(score>=1 && score<=40){
            System.out.println("D");
        }else if(score>=41 && score<=60){
            System.out.println("C");
        }else if(score>=61 && score<=90){
            System.out.println("B");
        }else if (score>=91 && score<=100){
            System.out.println("A");
        }else {
            System.out.println("Invalid score");
        }

    }
}
