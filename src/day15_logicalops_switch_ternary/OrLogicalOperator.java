package day15_logicalops_switch_ternary;

public class OrLogicalOperator {
    public static void main(String[] args) {
        // OR operator: either one is fine
        System.out.println("true || true= "+ (true || true));
        System.out.println("true || false= "+ (true || false)); //true
        System.out.println("false || true= "+ (false || true));
        System.out.println("false || false= "+ (false || false));
        int apples= 5;
        int oranges=7;
        System.out.println(apples>3 || oranges>4);
        if(apples>3 || oranges>4){
            System.out.println(" no need to buy any fruits");
        }
        System.out.println(apples>2 || oranges>10); //true || false = true
        System.out.println(apples>2 && oranges>10); //true && false = false
        if(apples>2 || oranges>10){
            System.out.println(" looks like we are good");
        }else{
            System.out.println("need to buy some fruits");
        }
        System.out.println(apples==0 || oranges==0);
        if(apples==0 || oranges==0){
            System.out.println("we need to purchase");
        }else {
            System.out.println("we are good with fruits");
        }
    }
}
