package day13_conditional_statements;

public class NotesIfElseStatement {
    public static void main(String[] args) {
        //2. yol:
        int weather= 55;
        boolean temp= weather>=75;
        if(temp){
            System.out.println("hot");
        }else{
            System.out.println("cold");
        }

        /*
        statement check etmenin 2 yolu var:
        1. int weather= 90, if(weather>=70) but here you have to assign weather before you type if, and assign int or sth
        2. I like this one better ama bazi durumlarda 1. kullanman gerekio: int weather= 90, boolean temp= weather>=75, check boolean in if statement.
         */
       /* int temp=90;
        if(temp>=70){
            System.out.println("hot");
        }else{
            System.out.println("cold");

        }

        */

    }


}
