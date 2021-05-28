package REPLT.Arrays;

public class ArraySum {
    public static void main(String[] args) {
        int [] nums= {3,4,6,1};
        int sum=0;

        for(int i=0; i<nums.length; i++){

            sum=sum+nums[i];
            //System.out.println(sum); bunu loop un icine yazarsan, toplami her satirda solicek, ama asagiya yazarsan bir sefer toplam yapip tek sum print edicek.
        }
        System.out.println(sum);

       // int sum=0;

    }
}
