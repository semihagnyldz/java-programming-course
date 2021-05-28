package day14_multi_branch_if_statements;
import java.util.Scanner;
public class ChooseLangugae {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("enter number for the language: ");
        int language;
        language=input. nextInt();

        if(language==1){
            System.out.println("hello, thanks for your call");
        }else if(language==2){
            System.out.println("hola");
        } else if(language==3){
            System.out.println("merhaba");
        } else if(language==4){
            System.out.println("privet");
        }
        System.out.println("lets talk java");

    }
}
