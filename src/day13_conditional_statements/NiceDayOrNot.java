package day13_conditional_statements;

public class NiceDayOrNot {
    public static void main(String[] args) {
        int temp = 90;
        boolean normaltemp= temp >=70;
        //if (temp >= 70) {
        if(normaltemp){
            System.out.println("It is a beautiful day!");
            System.out.println("Lets code java");
        } else {
            System.out.println("It is kind of cold today");
            System.out.println("Stay home and code java");
        }
    }
}
