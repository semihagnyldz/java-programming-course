package day30_arrays;

public class ForEachLoopArray {
    public static void main(String[] args) {
        int [] data= {32, 456,34,456,567, 56,3445, 1, 3,89};
        for( int eachNum: data){
            System.out.print(eachNum+" ");

        }
        System.out.println();
        for(int i=0; i<data.length; i++){ // i =o bc index starts with o yani int i=0==32.
            System.out.println(data[i]);

        }
        System.out.println(data.length-1);
        System.out.println(data[0]);
        // print all number backward in the same line
        for(int idx= data.length-1; idx>=0; idx--){
            System.out.print(data[idx]+" ");
        }
    }
}
