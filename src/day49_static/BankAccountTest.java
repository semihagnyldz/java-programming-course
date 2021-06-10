package day49_static;

import jdk.nashorn.internal.ir.BaseNode;

public class BankAccountTest {
    public static void main(String[] args) {
        BankAccount shared1= new BankAccount();
        shared1.user= "hasan";
        shared1.showBalance();
        shared1.spend(100);

        BankAccount shared2= new BankAccount();
        shared2.user="semiha";
        shared2.showBalance();
    }
}
