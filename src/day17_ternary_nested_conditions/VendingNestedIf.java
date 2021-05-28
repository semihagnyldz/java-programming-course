package day17_ternary_nested_conditions;

public class VendingNestedIf {
    public static void main(String[] args) {
        String selection= "snack"; //snack
        String drink= "tea"; //coke
        String snack= "chips"; //candy
        if(selection.equals("drink")) {
            System.out.println("Drink option is selected");
            if(drink.equals("tea")){
                System.out.println("tea is selected");
            } else{
                System.out.println("coke is selected");
            }
        } else if(selection.equals("snack")){
            System.out.println("Snack option is selected");

            if(snack.equals("chips")){
                System.out.println("chip item is selected");
            } else{
                System.out.println("candy item is selected");
            }
        }
    }
}
