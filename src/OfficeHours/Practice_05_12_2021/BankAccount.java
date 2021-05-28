package OfficeHours.Practice_05_12_2021;

public class BankAccount {

        String accountHolderName; //declaring a variable--instance variable--setting a string by default this is null value
        double balance;
        long accountNumber;
        //how would you describe bankaccount class?
        //do we have a object of a bank account yet?: no
        //we dont have a anything yet, balance, accountNumber..etc
        int pin;


        public double getBalance (int inputPin){
            if (pin == inputPin){
                return balance;
            }
            return -1;

        }
    }

