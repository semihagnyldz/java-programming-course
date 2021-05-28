package day45_oop;

public class CoffeeTest {
    public static void main(String[] args) {
        Coffee starbucks= new Coffee();
        System.out.println("coffee amount: "+starbucks.getAmount());
        starbucks.refill();
        System.out.println("amount after refill: "+starbucks.getAmount());
        starbucks.drink(40);
        System.out.println("amount after drink the amount of 40: "+starbucks.getAmount());
        starbucks.setType("Turkish Coffee");
        System.out.println("the ordered coffee is: "+starbucks.getType());
        //describe starbucks: show all varibale values
        System.out.println(starbucks.toString());
    }
}
