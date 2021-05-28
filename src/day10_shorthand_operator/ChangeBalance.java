package day10_shorthand_operator;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance= 1230.55;
        System.out.println("balance = " + balance);
        double baklava= 22.50;
        System.out.println("baklava = " + baklava);

        balance= balance - baklava;
        System.out.println("balance after baklava: "+ balance);
        double kunefe= 44.45;
        System.out.println("kunefe = " + kunefe);
        balance=balance-(kunefe+baklava);
        System.out.println("balance after kunefe and baklava:"+balance);
        kunefe= kunefe /2;
        balance= balance- kunefe;
        System.out.println("kunefe = " + kunefe);
        //balance= balance + kunefe=== balance+=kunefe;
       // n=n+3; same thing with=== n+=3




    }
}
