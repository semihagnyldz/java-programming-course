package day32_arrays_split;

public class CountUsingSplit {
    public static void main(String[] args) {
        //counting occurences in string using split:
        String catTypes="bengal cat tabby cat persian cat no cat here";
        String[] catsArray= catTypes.split(" ");
        System.out.println("number of cat: "+(catsArray.length-1));


        //with for loop:
        int count=0;
        for(int i=0; i<catsArray.length;i++){
            if(catsArray[i].equalsIgnoreCase("cat")){
                count++;
            }
        }
        System.out.println("count how many cats: "+count);

    }
}
