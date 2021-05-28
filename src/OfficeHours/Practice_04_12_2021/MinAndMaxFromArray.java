package OfficeHours.Practice_04_12_2021;

public class MinAndMaxFromArray { //min ve max ilk element i store et yani int min=arr[0]; and int max=arr[0]
    public static void main(String[] args) {
        int [] arr= {3,30,5,3,10,4,3};
        // bole yapamayiz cunku, int min=0;
       // int max=0; herzaman first element i store et! which is [0].
        int min= arr [0];
        int max= arr[1];
        for(int each: arr){
            if(each<min){
                min=each;
            }
            if(each>max){
                max=each;
            }


        }//these two if 's connected? logically they are not related.
        System.out.println(min);
        System.out.println(max);
            //for each: eger arraydaki sayilari baska bi containerda strore ediceksek for each daha mantikli, yani array in kendisi degismio, sadece container degisio, array degismicek,
             //BASTAN SONA GIDICEZ SADECE.
            // for: ama index no onemliyse for loop kullan


    }
    //each=every elemen is the same thing: for loop arr[i]
}
