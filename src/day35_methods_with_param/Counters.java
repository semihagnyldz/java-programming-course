package day35_methods_with_param;

public class Counters {
    public static void main(String[] args) {
        countTillTheCallingNumber(8);
        countTillTheCallingNumber(65);
    }
    public static void countTillTheCallingNumber(int callingNumber){
        for (int i=0; i<=callingNumber; i++){
            System.out.print(i+"-");
        }
    }
}
