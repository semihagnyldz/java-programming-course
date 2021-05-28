package day15_logicalops_switch_ternary;

public class Notes {
    public static void main(String[] args) {
        String company= "Citibank";
        double salary= 85_000.0;
        if(company.equals("Google") || salary>=100_000.0){
            System.out.println("I will accept it");
        }else
            System.out.println("not accept");

    }
    /*
    in multi branch conditional statement if the first condition is true the other wont get checked.
    || BC IF END RESULT CLEAR SECOND CONDITION WOULD BE SKIPPED AND NOT CHECKED.
    WHEN | is used both part will be checked. we always use ||, && to make our code for more efficiency.
    if you want to run the second part of the code, so use |. 
     */
    // company= google or other company's slary >=100k



}
