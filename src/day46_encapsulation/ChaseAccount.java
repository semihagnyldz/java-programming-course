package day46_encapsulation;

public class ChaseAccount {
    public static void main(String[] args) {
        CheckingAccount chaseCard= new CheckingAccount();
        chaseCard.setAccountHolder("semiha");
        System.out.println(chaseCard.getAccountHolder());
    }
}
