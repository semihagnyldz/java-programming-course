package day25_loops;

public class SumOfNumbers {
    public static void main(String[] args) {
       int sum=0;
        for(int num=1; num<=5;num++){
            System.out.println(num);
            sum+=num; //sum=sum+num bu num u sum a ekle sonra yeni sonucu sum a assign et demek.

        }
        System.out.println("sum of the number: "+sum);
    }
}
