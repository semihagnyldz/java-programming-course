package OfficeHours.Practice_04_19_2021;

public class MethodClass {
    /*
   1.  void=run a block of code, but there is no return value
        Arrays.sort(): void method, doesnt return anything. just sort the values.we just call Arrays.sort(), we cannot store this. like int a= Arrays.sort().
   2. return: runs a block of code, but there is a return value.
        Arrays.binarySearch(): return value and you can store it for example: int a=Arrays.binarySearch().

     */
    public static void main(String[] args) {
        methodOne();
    }
    public static void methodOne(){
        System.out.println("one");
    }
    public static String methodTwo(){
        return "two";
    }
}
