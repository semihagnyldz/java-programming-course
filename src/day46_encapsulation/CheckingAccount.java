package day46_encapsulation;

public class CheckingAccount {
    private int balance, accountNumber;
    private String accountHolder;
    private String type;

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "balance=" + balance +
                ", accountNumber=" + accountNumber +
                ", accountHolder='" + accountHolder + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance (){
        return balance;
    }
    public void setAccountNumber (int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber (){
        return accountNumber;
    }
    public void setAccountHolder (String accountHolder){
        this.accountHolder= accountHolder;
    }
    public String getAccountHolder (){
        return accountHolder;
    }
    public void setType (String type){
        this.type=type;
    }
    public String getType (){
        return type;
    }
}
