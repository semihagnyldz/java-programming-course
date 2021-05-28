package day38_methods;

public class MethodCallAnother {
    public static void main(String[] args) {
        for(int i=1; i<=100; i++){
            System.out.print(i+"--");
        }
        start();
        continues();
        withoutloop(1);
    }
    public static void start(){
        System.out.println("start");
        continues();
    }
    public static void continues(){
        System.out.println("continue");
        end();
    }
    public static void end(){
        System.out.println("end");

    }
    public static void withoutloop(int num){
        System.out.print(num+"--");
        num++;
        if(num>=0 &&num<=100){
            withoutloop(num);
        }
    }
}
