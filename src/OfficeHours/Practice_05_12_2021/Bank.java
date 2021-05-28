package OfficeHours.Practice_05_12_2021;

public class Bank {
    public static void main(String[] args) {
        //make an object of an bankAccount:
        BankAccount bankAccountOne= new BankAccount (); //new den sonra actual object
        bankAccountOne.balance= 1.000;
        bankAccountOne.accountHolderName="semiha";
        bankAccountOne.accountNumber=2134073;
        bankAccountOne.pin=1234;
        System.out.println(bankAccountOne.pin);
        System.out.println(bankAccountOne.getBalance(1234));



    }
}
