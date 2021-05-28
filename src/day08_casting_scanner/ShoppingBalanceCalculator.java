package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main(String[] args) {
        double price1= 20.88;
        double price2= 89.99;
        double price3= 15;

        double balance= 345.55;
        double remainingBalance= balance- (price1+price2+price3);
        int balanceWithNoCents= (int) remainingBalance;

        /*i dont want no chance, 219 instead 219.68
        i need to do casting
        balanceWithNoCents
         */

        //line 10 yani bi ustu, double yerine string yazinca "" icine almam gerektiole yapinca output icin --balance- (price1+price2+price3) bunu cikardio.
        System.out.println("Your remaining balance: "+remainingBalance);
        System.out.println("Your remaining balance: "+balanceWithNoCents);

    }
}
