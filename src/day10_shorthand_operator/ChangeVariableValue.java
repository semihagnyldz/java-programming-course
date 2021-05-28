package day10_shorthand_operator;

public class ChangeVariableValue {
    public static void main(String[] args) {
        int count=7;
        System.out.println("count= "+count);
        count= count+5;
        System.out.println("count= "+count);
        int features= 1456;
        System.out.println("we have "+features+ " applications in our company last year");
        features= features+367;
       // System.out.println("features = " + features);
        System.out.println("we have "+features+ " applications in our company now");
        features= features-823;
        System.out.println("features = " + features);
        int players= 10;
        players= players*2;
        System.out.println("players = " + players);
        int cents= 235;
        cents= cents%100;
        System.out.println("cents = " + cents);

    }
}
