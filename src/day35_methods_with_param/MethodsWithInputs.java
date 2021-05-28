package day35_methods_with_param;

public class MethodsWithInputs {
    public static void main(String[] args) {
        displayValue(0);
        displayValue(100);
        displayValue(-4);
        displayValue(10+6);
        int count= 55;
        displayValue(count);
        greetByName("semiha");
    }
    public static void displayValue(int num){
        System.out.println("value is: "+num);
    }
    public static void greetByName(String name){
        System.out.println("Hello "+ name+ ", how are you today?");
    }
}
