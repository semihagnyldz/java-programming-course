package day13_conditional_statements;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("**** WELCOME TO TD BANK ATM ****");
        int secretPincode= 2233;
        int inputPincode= 2233;
        // yukardaki sayilar compare etmenin 2 yolu var:
        //if(secretPincode==inputPincode) 1. yol.
boolean code= secretPincode==inputPincode; //2. yol
       // if(secretPincode==inputPincode) {
        if(code){
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance, deposit");
        }else {
            System.out.println("Incorrect pincode! "+ inputPincode);
            System.out.println("Please try again.");
        }

        }
    }

