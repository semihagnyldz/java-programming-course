package day45_oop;

public class Coffee {
    /**
     *
     */
    String type; //amount and type is variables
    int amount;
    //right click, generate, toString.press OK.
    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void refill (){
        amount=100;

    }
    public void drink (int someAmount){
        if(someAmount>=0 && someAmount<=100) {
            amount -= someAmount;
        }else{
            System.out.println("invalid amount");
        }

    }
    public int getAmount(){
        return amount;
    }
    public String getType(){

        return type;
    }
    public void setType(String newType){
        type=newType;

    }
}
