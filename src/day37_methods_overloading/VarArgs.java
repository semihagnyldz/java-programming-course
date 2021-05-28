package day37_methods_overloading;

public class VarArgs {
    public static void main(String[] args) {
        addNumbers(3,6,7);
        addNumbers(1,2,3,4,5,6,7,7,8,9,9);
        addNumbers();
    }
    public static void addNumbers(int... nums){
        //inside the method, it is used as regular array
        int sum=0;
        for(int n: nums){
            sum+=n;
        }
        System.out.println("sum: "+sum);
    }
}
