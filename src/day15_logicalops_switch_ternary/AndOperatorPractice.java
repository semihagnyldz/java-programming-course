package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale=true;
       boolean freeShipping=true;
        String item="wooden spoon";
        //if(onSale==true && freeShipping==true){ this line also works instead the below if condition
        if(onSale&&freeShipping&& item.equals("wooden spoon")){
            System.out.println(item+ ": Add to cart ");
        }else{
            System.out.println("Continue shopping");

        }
    }
}
