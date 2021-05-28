package OfficeHours.Practice_04_12_2021;

public class CountEvenAndOddNumbers {
    public static void main(String[] args) {
        int arr []= {0,1,5,7,6,10,35,68,100, 25, 80};
       // int odd=0;
        String odd="";
        int even=0;
        for (int i=0; i< arr.length; i++){
            if (i%2==0){
                even++;
            }else{
                odd+=odd; //string i odd++ die count yapamiosun.
            }
        }
        System.out.println("even: "+even);
        System.out.println("odd: "+odd);

        // array yapman icin size i bilmen gerekio:
        int [] evenNumbers= new int [even];
    }


}
