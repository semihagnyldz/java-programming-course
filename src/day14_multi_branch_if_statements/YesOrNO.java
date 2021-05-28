package day14_multi_branch_if_statements;
//import java.util.Scanner;
public class YesOrNO {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        //Scanner input= new Scanner(System.in);
        char selection='y';//selection is always one letter
       boolean answer;// to be able to give an answer to the end user for line 19 and 20.
        String result; //to be able to give an answer to the end user for line 19 and 20.
        // you can type more variable e.x:
        int deletedFiles; // these are for the last println statement.
        if(selection=='t'){
            System.out.println("your file will be deleted");
            answer=true;
            result= "deleted";
        }else{
            System.out.println("file deletion cancelled");
            answer= false;
            result="not deleted";
        }
        System.out.println("Did your file deleted? "+answer);
        System.out.println("did file get deleted? "+result);
        /*
        print "Are you sure you want to delete this file?"
selection > "y";
answer -> boolean variable

selection -- "y"
    true :
        "your file will be deleted"
        answer -> true
    false :
        "file deletion cancelled"
        answer -> false


"Did file get deleted? - true"

         */
    }

}
