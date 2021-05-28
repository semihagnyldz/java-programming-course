package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
      /*
        != is not equal comparison operator
       */
        System.out.println("!true= " + (!true));
        System.out.println("!false= " + (!false));
        int age = 2;
        boolean check = !(age > 7);
        if (check) {
            System.out.println("need to sit in child");
            /*
            or: if(!(age>7))
             */
        }
        String carModel= "Honda";
        boolean check1= !(carModel=="Tesla");
        if(check1){
            System.out.println("Not interested");
        }
        /*
        if(!carModel.equals("Tesla"))
         */
        String secretPassword= "abc123";
        String inputPassword= "abc321";
        if(!inputPassword.equals("abc123")){ // or if(!inputPassword.equals(secretPassword))
            //! means NOT.
            System.out.println("Incorrect password");
        }
    }
}
